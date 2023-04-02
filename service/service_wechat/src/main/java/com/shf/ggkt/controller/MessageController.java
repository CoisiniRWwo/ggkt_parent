package com.shf.ggkt.controller;

import com.shf.ggkt.result.Result;
import com.shf.ggkt.service.MessageService;
import com.shf.ggkt.utils.SHA1;
import me.chanjar.weixin.common.error.WxErrorException;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.util.*;

/**
 * @Author:Su HangFei
 * @Date:2023-04-01 19 57
 * @Project:ggkt_parent
 */
@RestController
@RequestMapping("/api/wechat/message")
public class MessageController {
    private static final String token = "ggkt";

    /**
     * 服务器有效性验证
     * @param request
     * @return
     */
    @GetMapping
    public String verifyToken(HttpServletRequest request) {
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
//        log.info("signature: {} nonce: {} echostr: {} timestamp: {}", signature, nonce, echostr, timestamp);
        if (this.checkSignature(signature, timestamp, nonce)) {
//            log.info("token ok");
            return echostr;
        }
        return echostr;
    }

    private boolean checkSignature(String signature, String timestamp, String nonce) {
        String[] str = new String[]{token, timestamp, nonce};
        //排序
        Arrays.sort(str);
        //拼接字符串
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < str.length; i++) {
            buffer.append(str[i]);
        }
        //进行sha1加密
        String temp = SHA1.encode(buffer.toString());
        //与微信提供的signature进行匹对
        return signature.equals(temp);
    }

    @Autowired
    private MessageService messageService;

    @PostMapping
    public String receiveMessage(HttpServletRequest request) throws Exception {

//        WxMpXmlMessage wxMpXmlMessage = WxMpXmlMessage.fromXml(request.getInputStream());
//        System.out.println(JSONObject.toJSONString(wxMpXmlMessage));
        Map<String, String> stringStringMap = parseXml(request);
        System.out.println(stringStringMap);
//        Map<String, String> stringStringMap = this.parseXml(request);
        String message = messageService.receiveMessage(stringStringMap);
        return message;
//        return "success";
    }

    private Map<String, String> parseXml(HttpServletRequest request) throws Exception {
        Map<String, String> map = new HashMap<String, String>();
        SAXReader reader = new SAXReader();
        InputStream inputStream = request.getInputStream();
        Document document = reader.read(inputStream);
        Element rootElement = document.getRootElement();
        List<Element> elementList = rootElement.elements();
        for (Element e : elementList) {
            map.put(e.getName(), e.getText());
        }
        inputStream.close();
//        inputStream = null;
        return map;
    }

    //模板消息接口
    @GetMapping("/pushPayMessage")
    public Result pushPayMessage() throws WxErrorException {
        messageService.pushPayMessage(1L);
        return Result.ok(null);
    }
}

package com.shf.ggkt.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author:Su HangFei
 * @Date:2023-03-29 19 28
 * @Project:ggkt_parent
 */
@Data
@ApiModel(value = "全局统一返回结果")
@NoArgsConstructor
public class Result<T> {
    @ApiModelProperty(value = "返回码")
    private Integer code;

    @ApiModelProperty(value = "返回消息")
    private String message;

    @ApiModelProperty(value = "返回数据")
    private T data;

    public static <T> Result<T> build(T body, Integer code, String message) {
        Result<T> result = new Result<T>();
        if (body != null) {
            result.setData(body);
        }
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    //成功的方法
    public static<T> Result<T> ok(T data){
        return build(data,20000,"成功");
    }

    //失败的方法
    public static<T> Result<T> fail(T data){
        return build(data, 20001,"失败");
    }

    public Result<T> message(String msg){
        this.setMessage(msg);
        return this;
    }

    public Result<T> code(Integer code){
        this.setCode(code);
        return this;
    }

}

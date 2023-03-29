package com.shf.ggkt.exception;

import com.shf.ggkt.result.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author:Su HangFei
 * @Date:2023-03-29 20 24
 * @Project:ggkt_parent
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    //全局异常
    @ExceptionHandler(Exception.class)
    public Result error(Exception e){
        System.out.println("全局异常");
        e.printStackTrace();
        return Result.fail(null).message("执行了全局异常处理");
    }

    //特定异常
    @ExceptionHandler(ArithmeticException.class)
    public Result error(ArithmeticException e){
        System.out.println("特定异常");
        e.printStackTrace();
        return Result.fail(null).message("执行了特定异常处理");
    }

    //自定义异常
    @ExceptionHandler(GgktException.class)
    public Result error(GgktException e){
        e.printStackTrace();
        return Result.fail(null).message(e.getMsg()).code(e.getCode());
    }
}

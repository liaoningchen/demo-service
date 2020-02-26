package com.cdy.demo.controllers;


import com.cdy.base.util.bean.RespBean;
import com.cdy.base.util.bean.ResultEnum;
import com.cdy.base.util.exception.CheckException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;


@ControllerAdvice
public class MyControllerAdvice {
    Logger log = LoggerFactory.getLogger(MyControllerAdvice.class);
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public RespBean errorHandler(Exception e) {
        log.error("系统异常",e);
        return  RespBean.error(ResultEnum.ERROR.getCode(),ResultEnum.ERROR.getDesc(),null);
    }

    /**
     * 拦截捕捉自定义异常 CheckException.class
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = CheckException.class)
    public RespBean myErrorHandler(CheckException e) {
        log.error(e.getMessage());
        return  RespBean.error(e.getCode(),e.getDesc(),null);
    }

}

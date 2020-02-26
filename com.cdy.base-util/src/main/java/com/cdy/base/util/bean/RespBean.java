package com.cdy.base.util.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RespBean {
    private Integer code;
    private String msg;
    private Object data;

    public static RespBean success(int code,String msg,Object data){
        return new RespBean(code,msg,data);
    };
    public static RespBean success(Object data){
        return success(ResultEnum.SUCCESS.getCode(),ResultEnum.SUCCESS.getDesc(),data);
    };

    public static RespBean error(int code,String msg,Object data){
        return new RespBean(code,msg,data);
    };
    public static RespBean error(Object data){
        return error(ResultEnum.ERROR.getCode(),ResultEnum.ERROR.getDesc(),data);
    };

}

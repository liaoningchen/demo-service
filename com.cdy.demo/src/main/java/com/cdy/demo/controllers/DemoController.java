package com.cdy.demo.controllers;

import com.cdy.base.util.bean.RespBean;
import com.cdy.base.util.check.CheckUtil;
import com.cdy.base.util.ruler.base.StrRuler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/hello")
    public RespBean hello(String arg){
        CheckUtil.check("", StrRuler.notEmpty());
        return RespBean.success("success");
    }
}

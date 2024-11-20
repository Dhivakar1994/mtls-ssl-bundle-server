package com.mtls.ssl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/server")
public class MtlsSslServerController {

    @GetMapping("/getMsg")
    public String getMessage(){
        return "Successfully Connected!!";
    }
}

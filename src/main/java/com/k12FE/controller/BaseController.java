package com.k12FE.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
    @GetMapping("/customer")
    public String home(){
        return "/customer/customer";
    }
    @GetMapping("/employee")
    public String employee(){
        return "/employee/employee";
    }
    @GetMapping("/product")
    public String product(){
        return "/product/product";
    }
}

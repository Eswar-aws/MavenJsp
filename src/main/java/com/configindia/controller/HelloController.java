package com.configindia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  
public class HelloController {  
@RequestMapping("/h")  
    public String display()  
    {  
	System.out.println("hello controller");
        return "index";  
    }     
}  
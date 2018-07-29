package com.becomeJavaPro.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Java9ProController {
    @RequestMapping("/login")
    public String loginPage(){
        System.out.println("Login");
        return "login";
    }

    @RequestMapping("/")
    public String logoutPage(){
        return "logout";
    }

}

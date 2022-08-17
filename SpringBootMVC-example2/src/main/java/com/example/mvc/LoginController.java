package com.example.mvc;


import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class LoginController {
    @RequestMapping("/")
    public String init(Model model) {
        model.addAttribute("msg", "Please Enter Your Login Details");
        return "login";
    }

    @PostMapping("/hello")
    public String submit(Model model,@ModelAttribute("loginBean") LoginBean loginBean) {
        if (loginBean != null && loginBean.getUserName() != null
                & loginBean.getPassword() != null) {
            if (loginBean.getUserName().equals("shivesh")
                    && loginBean.getPassword().equals("password")) {
                model.addAttribute("msg", loginBean.getUserName());
                return "success";
            } else {
                model.addAttribute("error", "Invalid Details");
                return "login";
            }
        } else {
            model.addAttribute("error", "Please enter Details");
            return "login";
        }
    }
}
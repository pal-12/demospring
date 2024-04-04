package com.nagarro.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nagarro.demo.model.User;
import com.nagarro.demo.services.UserService;

@Controller
public class MainController {

    @Autowired
    private UserService userService;

    @RequestMapping("/register")
    public String showRegisterPage(Model model) {
        model.addAttribute("user", new User());
        return "index";
    }

    @RequestMapping(value = "/do_register", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("user") User userDetails, Model model) {
        userDetails.setPassword(userDetails.getPassword());
        this.userService.saveUser(userDetails);
        model.addAttribute("message", "Registration Successful!");
        return "registration-success";
    }
}

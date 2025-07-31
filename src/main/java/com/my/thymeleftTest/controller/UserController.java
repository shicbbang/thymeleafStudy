package com.my.thymeleftTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
//localhost:8080/user
public class UserController {
    @GetMapping("/login")
    //localhost:8080/user/login
    public String userLogin() {
        return "/user/userLogin";
    }

    @GetMapping("/info")
    //localhost:8080/user/info
    public String userSuccess() {
        return "/user/userInfo";
    }

    @GetMapping("saveInfo")
    public String userInfoSave() {
        System.out.println("사용자 저장 정보를 저장 했어요.");
        return "redirect:/main";
    }
}

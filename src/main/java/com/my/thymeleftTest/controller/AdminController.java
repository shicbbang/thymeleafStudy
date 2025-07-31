package com.my.thymeleftTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    @GetMapping("/admin/info")
    public String adminInfo() {
        return "/admin/adminInfo";
    }

    @GetMapping("/admin/report")
    public String adminReport() {
        return "admin/adminReport";
    }

}

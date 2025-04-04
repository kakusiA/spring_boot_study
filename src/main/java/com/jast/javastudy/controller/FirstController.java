package com.jast.javastudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")//url
    public String niceToMeeYou(Model model) {//Model model  모델 추가
        model.addAttribute("uesrname","경민");
        return "greetings";
    }
    @GetMapping("/bye")
    public String bye(Model model) {
        model.addAttribute("username","홍길동");
        return "goodbye";
    }
}

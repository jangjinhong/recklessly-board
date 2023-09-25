package com.recklesslystudy.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {
    @GetMapping("/")        // ("/")로 들어갔을때
    @ResponseBody           // return값을 띄워줄 어노테이션
    public String main() {
        return "hello world";
    }
}

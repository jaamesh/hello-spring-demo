package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping("")
    @ResponseBody
    public String root() {
        return "<h1><a href=\"form\">Click here</a></h1>";
    }

    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "<h1>Hello!!!</h1>";
    }

    @GetMapping("form")
    @ResponseBody
    public String form() {
        String html =
                "<html>" +
                        "<body>" +
                        "<form method = 'post' action = '/form'>" +
                        "<input type = 'text' name = 'coder' />" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                        "</form>" +
                        "</body>" +
                        "</html>";
        return html;
    }

    @PostMapping("form")
    @ResponseBody
    public String formPost(@RequestParam String coder) {
        return "<h1>Hi " + coder + "</h1>";
    }

}

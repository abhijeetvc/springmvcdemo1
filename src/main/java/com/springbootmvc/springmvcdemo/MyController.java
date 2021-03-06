package com.springbootmvc.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {


//    @GetMapping("/index")
//    public String greeting(@RequestParam(name="name", required=false, defaultValue="World")
//                                       String name, Model model) {
//        model.addAttribute("name", name);
//        return "index";
//    }
//
    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/greeting")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }

}

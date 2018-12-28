package com.lst.control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lst
 * @date  2018-12-28
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(Model model,@RequestParam(value="name", required = false, defaultValue = "world")String name){
        model.addAttribute("name",name);
        return "hello";
    }
}

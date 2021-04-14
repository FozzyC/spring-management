package com.example.management.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/homepage")
    public String index() {
        return"index.html";
    }

}

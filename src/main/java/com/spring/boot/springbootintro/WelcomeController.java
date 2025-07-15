package com.spring.boot.springbootintro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class WelcomeController {

    @GetMapping("/name")
    public String name(){
        return "<h1>My name is Abdullah</H1>";
    }

    @GetMapping("/age")
    public String age(){
        return "<b>My age is 25</b>";
    }

    @GetMapping("check/status")
    public String checkStatus(){
        return "<H2>Everything OK</H2>";
    }

    @GetMapping("/health")
    public String health(){
        return "<H3>Server health is up and running</H3>";
    }

    @GetMapping("names")
    public ArrayList names(){
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abdullah");
        names.add("Ali");
        names.add("Ahmed");
        names.add("Hassan");
        names.add("Mohammed");

        return names;
    }
}

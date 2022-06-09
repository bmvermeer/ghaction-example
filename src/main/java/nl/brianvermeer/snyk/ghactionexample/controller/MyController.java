package nl.brianvermeer.snyk.ghactionexample.controller;


import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String hello(@RequestParam(required = false) String name) {
        var greeting = "Hello ";
        var wave = "👋";

//        if (name != null) {
//            return greeting + name + " " + wave;
//        }

        return greeting + wave;
    }
}

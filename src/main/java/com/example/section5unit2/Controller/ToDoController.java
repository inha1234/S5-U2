package com.example.section5unit2.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToDoController {
    @GetMapping
    public String helloWorld(){
        return "To-do Application !";
    }
}

package com.hess.sfgdi.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello World");

        return "Hi Folks";
    }

    public String sayBye(){
        System.out.println("Now I must leave");

        return "buh bye";
    }
}

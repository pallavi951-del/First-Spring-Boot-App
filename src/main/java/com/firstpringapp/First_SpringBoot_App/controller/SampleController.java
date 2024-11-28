package com.firstpringapp.First_SpringBoot_App.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample/apis")
public class SampleController {

     @GetMapping("/ getSample")
    public String SampleApi(){
        return " This is our first API";
    }


    @GetMapping("/ getSample2")
    public String SampleApi2(){
        return " This is our first API";
    }



}

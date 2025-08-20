package com.klu.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ArithmeticOperations {
  
  @GetMapping("add/{A}/{B}")
  public String add(@PathVariable("A") int a ,@PathVariable("B") int b)
  {
    return "Addition= " +(a+b);
  }

}
package me.sbkg.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author : ms.Lee
 * date   : 2024-01-04
 */
@RestController
public class HelloController {

  @RequestMapping (value = "/hello")
  public String hello() {

    return "Hello World";
  }
}

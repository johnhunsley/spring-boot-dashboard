package com.hunsley.spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MyController {

  @Value("${my.controller.message}")
  private String message;

  @RequestMapping(method = RequestMethod.GET, value = "/example")
  public String message() {
    log.info("GET Request /example - "+message);
    return message;
  }
}

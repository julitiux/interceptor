package com.interceptor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController {

  @RequestMapping(value = "/products", method = RequestMethod.GET)
  public ResponseEntity<Object> getProduct() {
    return new ResponseEntity<>(null, HttpStatus.OK);
  }

}

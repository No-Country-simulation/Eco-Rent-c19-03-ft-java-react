package tech.nocountry.eco_rent.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

  @GetMapping({"/", "/index"})
  public String inicio() {
    return "index";
  }
}

package de.dbck.poc.pochelloworldjpa.hello;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HelloController {
  private final Environment env;
  private final HelloRepository repo;

  @GetMapping
  public String get(Model model) {
    Hello hello = new Hello();
    hello.setMessage("Called page. Hello World!");
    repo.save(hello);
    List<Hello> hellos = repo.findByOrderByCreatedAtDesc();
    model.addAttribute("activeProfiles", env.getActiveProfiles());
    model.addAttribute("hellos", hellos);
    return "index";
  }
}

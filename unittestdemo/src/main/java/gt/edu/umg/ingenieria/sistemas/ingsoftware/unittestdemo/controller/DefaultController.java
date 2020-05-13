package gt.edu.umg.ingenieria.sistemas.ingsoftware.unittestdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/default")
public class DefaultController {

    @GetMapping("/sayhello")
    public String sayHello(@RequestParam("yourName") String yourName) {
        return String.format("Hello %s", yourName);
    }
}

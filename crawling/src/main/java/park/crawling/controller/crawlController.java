package park.crawling.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class crawlController {

    @GetMapping("/test")
    public String test(){
        return "hi";
    }

    @PostMapping("/crawl")
    public void crawl(){

    }
}

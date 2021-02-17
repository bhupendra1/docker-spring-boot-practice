package com.bhupendra.docker.dockerspringboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/docker/message")
public class MessageController {

    @GetMapping
    public String message() {
        return "Hello Docker";
    }
}

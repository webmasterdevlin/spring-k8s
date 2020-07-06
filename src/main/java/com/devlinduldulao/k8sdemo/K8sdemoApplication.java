package com.devlinduldulao.k8sdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class K8sdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sdemoApplication.class, args);

        getJSON();
    }

    @GetMapping("/")
    public static Map<String, String> getJSON() {
        HashMap<String, String> map = new HashMap<>();
        map.put("id", "324ur89y893");
        map.put("username", "this is Spring Boot");
        return map;
    }
}

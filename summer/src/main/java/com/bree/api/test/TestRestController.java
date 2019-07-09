package com.bree.api.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

    @Autowired
    private TestRestService testRestService;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return testRestService.testRestService(name);
    }
}

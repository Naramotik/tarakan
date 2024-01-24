package com.example.demo.controller;

import com.example.demo.model.Test;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @PostMapping("/{discipline_title}")
    public Test saveTest(@RequestBody Test test,
                         @PathVariable String discipline_title){
        return testService.save(test, discipline_title);
    }

    @GetMapping
    public List<Test> getAllTests(){
        return testService.findAll();
    }


}

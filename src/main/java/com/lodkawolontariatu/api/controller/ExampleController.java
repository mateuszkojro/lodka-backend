package com.lodkawolontariatu.api.controller;

import com.lodkawolontariatu.api.model.Person;
import com.lodkawolontariatu.api.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ExampleController {

    private final PersonService personService;

    @GetMapping(path="/helloworld/{id}")
    public String get(@PathVariable int id, @RequestParam String name){
        return "Hello World " + id + " " + name;
    }

    @PostMapping(path = "/person")
    public Person post(@RequestBody Person person){
        return personService.processPerson(person);
    }

    @GetMapping(path = "/{id}")
    public Person getById(@PathVariable long id){
        return personService.getById(id);
    }
}

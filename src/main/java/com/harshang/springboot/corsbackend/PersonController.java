package com.harshang.springboot.corsbackend;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @GetMapping("/person")
    public List<Person> getPerson() {
        return (List<Person>) personRepository.findAll();
    }

    @PostMapping("/person")
    void addPerson(@RequestBody Person person) {
        personRepository.save(person);
    }
}

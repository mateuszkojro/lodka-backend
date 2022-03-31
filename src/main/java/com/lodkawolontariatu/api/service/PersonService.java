package com.lodkawolontariatu.api.service;

import com.lodkawolontariatu.api.model.Person;
import com.lodkawolontariatu.api.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Locale;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;

    public Person processPerson(Person person){
        person.setName(person.getName().toUpperCase(Locale.ROOT));
        return personRepository.save(person);
    }

    public Person getById(Long id){
        return personRepository.findById(id).orElseThrow();
    }
}

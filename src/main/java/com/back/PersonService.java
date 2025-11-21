package com.back;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;
    public PersonService(@Qualifier("personRepositoryV2") PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public long count() {
        return personRepository.count();
    }
}
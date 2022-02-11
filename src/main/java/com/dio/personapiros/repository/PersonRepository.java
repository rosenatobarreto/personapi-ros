package com.dio.personapiros.repository;

import com.dio.personapiros.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}

package com.dio.personapiros.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.dio.personapiros.dto.request.PersonDTO;
import com.dio.personapiros.entity.Person;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person  toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}

package com.example.happy.mapper;

import com.example.happy.domain.PersonInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PersonMapper {
    void insertPerson(PersonInfo person);
    PersonInfo queryPersonById(int id);
    void deletePersonById(int id);
    void updatePerson(PersonInfo person);
    List <PersonInfo> queryPersonList();

}

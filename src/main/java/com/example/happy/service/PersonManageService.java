package com.example.happy.service;

import com.example.happy.domain.PersonInfo;

import java.util.List;

public interface PersonManageService {
    void insertPerson (PersonInfo person);

    PersonInfo queryPersonById(int id);

    void deletePersonById(int id);

    void updatePerson(PersonInfo person);

    List<PersonInfo> queryPersonList();
}

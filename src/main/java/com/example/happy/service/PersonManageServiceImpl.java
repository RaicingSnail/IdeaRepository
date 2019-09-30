package com.example.happy.service;

import com.example.happy.domain.PersonInfo;
import com.example.happy.mapper.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonManageServiceImpl implements PersonManageService {
    @Autowired
    private PersonMapper personMapper;

    @Override
    public void insertPerson(PersonInfo personInfo){
        personMapper.insertPerson(personInfo);
    }

    @Override
    public PersonInfo queryPersonById(int id){
        PersonInfo personInfo = personMapper.queryPersonById(id);
        return personInfo;
    }

    @Override
    public void deletePersonById(int id){
        personMapper.deletePersonById(id);
    }

    @Override
    public void updatePerson(PersonInfo personInfo){
        personMapper.updatePerson(personInfo);
    }

    @Override
    public List<PersonInfo> queryPersonList(){
        List<PersonInfo> list = personMapper.queryPersonList();
        return list;
    }
}

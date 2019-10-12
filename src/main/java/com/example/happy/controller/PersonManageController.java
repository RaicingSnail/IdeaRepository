package com.example.happy.controller;

import com.example.happy.domain.PersonInfo;
import com.example.happy.service.PersonManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonManageController {

    @Autowired
    private PersonManageService personManageService;

    @RequestMapping(value = "/insert/{id}")
    public String insert(@PathVariable("id") int id) {
        PersonInfo person = new PersonInfo();
        person.setId(id);
        person.setName("测试" + id);
        personManageService.insertPerson(person);
        return "insert success";
    }

    @RequestMapping(value = "/queryOne/{id}")
    public String queryOne(@PathVariable("id") int id) {
        PersonInfo person = personManageService.queryPersonById(id);
        return "person.getId()=" + person.getId() + "person.getName()=" + person.getName();
    }

    @RequestMapping(value = "/update/{id}")
    public String update(@PathVariable("id") int id) {
        PersonInfo person = new PersonInfo();
        person.setId(id);
        person.setName(id + "改");
        personManageService.updatePerson(person);
        return "update success....";
    }

    /**
     * 查询全部数据
     * @return
     */
    @RequestMapping(value = "/queryAll")
    public String queryAll() {
        List<PersonInfo> list = personManageService.queryPersonList();
        String str = "";
        for (PersonInfo person : list) {
            str = str + ("ID=" + person.getId()+",NAME="+person.getName()+"；");
        }
        return str;
    }

    @RequestMapping(value = "/delete")
    public String delete(int id){
        personManageService.deletePersonById(id);
        return "delete success ...";
    }

}

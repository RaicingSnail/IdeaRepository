package com.example.happy.controller;

import com.example.happy.domain.PersonInfo;
import com.example.happy.service.PersonManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/person")
public class PersonManageController {

    @Autowired
    private PersonManageService personManageService;

    @RequestMapping(value = "/insert")
    public String insert(int id) {
        PersonInfo person = new PersonInfo();
        person.setId(id);
        person.setName("测试" + id);
        personManageService.insertPerson(person);
        return "insert success";
    }

    @RequestMapping(value = "/queryOne")
    public String queryOne(int id) {
        PersonInfo person = personManageService.queryPersonById(id);
        return "person.getId()=" + person.getId() + "person.getName()=" + person.getName();
    }

    @RequestMapping(value = "/update")
    public String update(int id) {
        PersonInfo person = new PersonInfo();
        person.setId(id);
        person.setName("测试" + id + "改");
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
            str = str + ("person.getId()=" + person.getId()+"+person.getName()="+person.getName());
        }
        return str;
    }

    @RequestMapping(value = "/delete")
    public String delete(int id){
        personManageService.deletePersonById(id);
        return "delete success ...";
    }

}

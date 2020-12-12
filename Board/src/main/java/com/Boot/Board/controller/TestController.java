package com.Boot.Board.controller;

import com.Boot.Board.dto.Member;
import com.Boot.Board.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TestController {
    private service s;

    @Autowired
    public TestController(service s){
        this.s = s;
    }
    @GetMapping("/")
    public String test(){
        Member m = new Member(0L,"hello");
        Member m1 = new Member(0L,"hello1");
        Member m2 = new Member(0L,"hello2");
        Member m3 = new Member(0L,"hello3");
        s.join(m);
        s.join(m1);
        s.join(m2);
        s.join(m3);

        return "Hello Boot!";
    }

    @GetMapping("member/delete")
    public String delete(){
        s.delete(4L);
        return "complete";
    }
    @GetMapping("member/all")
    public ArrayList<Member> findAll(){
        return s.findAll();
    }
}

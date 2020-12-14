package com.Boot.Board.service;

import com.Boot.Board.dto.User;
import com.Boot.Board.repository.usersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private usersMapper mapper;

    @Autowired
    public UserService(usersMapper mapper){
        this.mapper = mapper;
    }

    public void join(String id, String name){
        mapper.joinUser(id,name);
    }

    public List<User> all(){
        return mapper.getAllUser();
    }
}

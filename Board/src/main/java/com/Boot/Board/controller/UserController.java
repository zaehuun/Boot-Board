package com.Boot.Board.controller;

import com.Boot.Board.dto.User;
import com.Boot.Board.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class UserController {
    private UserService sv;

    public UserController(UserService sv){
        this.sv = sv;
    }

    @GetMapping("/join")
    public String join(){
        sv.join("20150570","김재훈");
        sv.join("20150571","김재훈1");
        sv.join("20150572","김재훈2");
        return "완료";
    }

    @GetMapping("/all")
    public List<User> all(){
        return sv.all();
    }

}

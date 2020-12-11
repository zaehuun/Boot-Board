package com.Boot.Board.repository;

import com.Boot.Board.dto.Member;

import java.util.List;

public interface repoInterface {

    /*회원 등록*/
    Member save(Member m);

    /*ID로 조회*/
    String findById(int id);

    /*이름 변경*/
    String changeNameById(int id);

    /*회원 삭제*/
    Boolean delete(int id);

    /*전체 조회*/
    List<String> getAll();




}

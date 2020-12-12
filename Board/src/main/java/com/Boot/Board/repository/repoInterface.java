package com.Boot.Board.repository;

import com.Boot.Board.dto.Member;

import java.util.ArrayList;
import java.util.List;

public interface repoInterface {

    /*회원 등록*/
    Member save(Member m);

    /*ID로 조회*/
    Member findById(Long id);

    /*이름 변경*/
    Member changeNameById(Long id, String name);

    /*회원 삭제*/
    boolean delete(Long id);

    /*전체 조회*/
    ArrayList<Member> getAll();




}

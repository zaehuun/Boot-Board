package com.Boot.Board.service;

import com.Boot.Board.dto.Member;
import com.Boot.Board.repository.memoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class service {
    private memoryRepo repo;

    @Autowired
    public service(memoryRepo repo){
        this.repo = repo;
    }

    public void join(Member m){
        repo.save(m);
    }

    public Member findMember(Long id){
        Member m = repo.findById(id);
        if (m == null){
            return null;
        }
        return m;
    }

    public boolean changeName(Long id, String name){
        if (repo.changeNameById(id, name) != null)
            return true;
        return false;
    }

    public void delete(Long id){
        Member m = repo.findById(id);
        if (m != null){
            repo.delete(id);
            System.out.println(m.getName()+"님이 삭제 됨.");
            return;
        }
        System.out.println("삭제할 회원이 존재하지 않음.");
    }

    public ArrayList<Member> findAll(){
        return repo.getAll();
    }
}

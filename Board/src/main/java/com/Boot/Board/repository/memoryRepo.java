package com.Boot.Board.repository;

import com.Boot.Board.dto.Member;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class memoryRepo implements repoInterface {
    private static Map<Long,Member> store = new HashMap<Long,Member>();
    private static Long id = 0L;
    @Override
    public Member save(Member m) {
        m.setId(++id);
        store.put(m.getId(),m);
        return m;
    }

    @Override
    public Member findById(Long id) {
        Member m = store.get(id);
        if (m != null)
            return m;
        return null;
    }

    @Override
    public Member changeNameById(Long id, String name) {
        Member m = store.get(id);
        if (m != null){
            m.setName(name);
            return m;
        }
        return null;
    }

    @Override
    public boolean delete(Long id) {
        Member m = store.get(id);
        if (m != null){
            store.remove(m.getId());
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Member> getAll() {

        return new ArrayList<>(store.values());
    }
}

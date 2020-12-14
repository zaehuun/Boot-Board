package com.Boot.Board.repository;

import com.Boot.Board.dto.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface usersMapper {

    @Select("SELECT * FROM users WHERE id=#{id}")
    User getUserById(@Param("id") String id);

    @Select("SELECT * FROM users")
    List<User> getAllUser();

    @Insert("INSERT INTO users VALUES(#{id},#{name})")
    int joinUser(@Param("id") String id, @Param("name") String name);

    @Update("UPDATE users SET name=#{name} WHERE id=#{id}")
    int updateUser(@Param("id") String id, @Param("name") String name);

    @Delete("DELETE FROM user WHERE id=#{id}")
    int deleteUser(@Param("id") String id);
}

package com.learnandgrow.springbootmybatis.mapper;

import com.learnandgrow.springbootmybatis.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from users")
    List<User> findAll();

    @Insert("insert into users(name,salary,id) values (#{name},#{salary},#{id})")
    void insert(User user);
}

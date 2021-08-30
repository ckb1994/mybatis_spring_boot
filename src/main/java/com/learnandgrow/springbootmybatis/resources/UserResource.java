package com.learnandgrow.springbootmybatis.resources;

import com.learnandgrow.springbootmybatis.mapper.UserMapper;
import com.learnandgrow.springbootmybatis.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    private UserMapper userMapper;

    public UserResource(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @GetMapping("/all")
    public List<User> getAll(){
        return userMapper.findAll();
    }
    
    @GetMapping("/update")
    public List<User> update(){
        User user = new User();
        user.setName("You");
        user.setSalary((long) 50.25);
        user.setId(5);

        userMapper.insert(user);
        return userMapper.findAll();

    }
}

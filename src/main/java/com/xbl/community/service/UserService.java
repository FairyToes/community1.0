package com.xbl.community.service;

import com.xbl.community.dao.UserMapper;
import com.xbl.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User findById(int id){
        return userMapper.selectById(id);
    }
}

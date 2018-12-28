package com.lst.service.impl;

import com.lst.domain.entit.User;
import com.lst.mapper.UserMapper;
import com.lst.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author lst
 * @date  2018-12-28
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.findAll();
    }

    @Override
    public User findUserById(long id) {
        return userMapper.findById(id);
    }

    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public void edit(User user) {
        userMapper.save(user);
    }

    @Override
    public void delete(long id) {
        userMapper.deleteById(id);
    }
}

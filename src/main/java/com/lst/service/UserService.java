package com.lst.service;

import com.lst.domain.entit.User;

import java.util.List;

/**
 * @author lst
 * @date  2018-12-28
 */
public interface UserService {

    public List<User> getUserList();

    public User findUserById(long id);

    public void save(User user);

    public void edit(User user);

    public void delete(long id);

}

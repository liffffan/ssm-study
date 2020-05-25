package com.kuang.dao;

import com.kuang.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> getUserList();

    public User getUserById(Integer id);

    public int addUser(User user);

    public int updateUser(User user);

    public int deleteUser(int id);
}

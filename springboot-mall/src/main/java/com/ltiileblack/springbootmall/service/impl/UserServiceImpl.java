package com.ltiileblack.springbootmall.service.impl;

import com.ltiileblack.springbootmall.dao.UserDao;
import com.ltiileblack.springbootmall.dto.UserRegisterRequest;
import com.ltiileblack.springbootmall.model.User;
import com.ltiileblack.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);

    }
}

package com.ltiileblack.springbootmall.service.impl;

import com.ltiileblack.springbootmall.dao.UserDao;
import com.ltiileblack.springbootmall.dto.UserRegisterRequest;
import com.ltiileblack.springbootmall.model.User;
import com.ltiileblack.springbootmall.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

@Component
public class UserServiceImpl implements UserService {

    private final static Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        // 檢查註冊的 email
        User user = userDao.getUserEmail(userRegisterRequest.getEmail());

        if (user != null){
            log.warn("該 email {} 已被註冊了 傻B", userRegisterRequest.getEmail());
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        //創建帳號
        return userDao.createUser(userRegisterRequest);

    }
}

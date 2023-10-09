package com.ltiileblack.springbootmall.dao;

import com.ltiileblack.springbootmall.dto.UserRegisterRequest;
import com.ltiileblack.springbootmall.model.User;

public interface UserDao {

    User getUserById(Integer userId);
    User getUserEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}

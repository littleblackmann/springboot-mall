package com.ltiileblack.springbootmall.service;

import com.ltiileblack.springbootmall.dto.UserRegisterRequest;
import com.ltiileblack.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);
}

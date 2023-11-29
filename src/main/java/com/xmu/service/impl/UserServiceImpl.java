package com.xmu.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xmu.entity.User;
import com.xmu.mapper.UserMapper;
import com.xmu.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户ServiceImpl
 *
 * @author Ove
 * @date 2023-11-28 16:51
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}

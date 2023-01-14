package com.itheima.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.UserDao;
import com.itheima.domain.Users;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IUserServiceImpl extends ServiceImpl<UserDao, Users> implements IUserService {

    @Autowired
    private UserDao userDao;

    @Override
    public Users login(Users users) {
        return userDao.login(users);
    }


}

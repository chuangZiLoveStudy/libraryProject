package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Users;

public interface IUserService extends IService<Users> {

    public Users login(Users users);

}

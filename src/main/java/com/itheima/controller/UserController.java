package com.itheima.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.itheima.controller.utils.Result;
import com.itheima.domain.Users;
import com.itheima.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserService iUserService;

    @PostMapping("/login")
    public Result login(@RequestBody Users users){

        LambdaQueryWrapper<Users> lqw = new LambdaQueryWrapper<>();
        lqw.eq(Users::getUsername,users.getUsername());
        Users user = iUserService.getOne(lqw);
        if (user == null){
            return new Result(1,user,"查无此人");
        }
        if(!users.getPassword().equals(user.getPassword())){
            return new Result(1,"密码错误");
        }
        return new Result(1,user,"登录成功");
    }

    @GetMapping
    public Result getAll(){
        List<Users> list = iUserService.list();
        return new Result(1,list,"查询成功");
    }

    @PostMapping
    public Result save(@RequestBody Users users){
        boolean flag = iUserService.save(users);
        return new Result(flag?1:0,flag?"添加成功":"添加失败");
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        boolean flag = iUserService.removeById(id);
        return new Result(flag?1:0,flag?"删除成功":"删除失败");
    }


}

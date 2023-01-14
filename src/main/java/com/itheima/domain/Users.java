package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@AllArgsConstructor //全参构造
@NoArgsConstructor  //空参构造
@TableName(value = "tbl_users")
public class Users {

    private Integer id;
    @TableField(value = "name")
    private String username;
    @TableField(value = "pwd", select = true)//
    private String password;
    @TableLogic(value = "0",delval = "1")
    private int deleted;
}

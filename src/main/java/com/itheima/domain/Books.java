package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tbl_books")
public class Books {
    private Integer id;
    @TableField(value = "name")
    private String bookname;
    private String synopsis;
}

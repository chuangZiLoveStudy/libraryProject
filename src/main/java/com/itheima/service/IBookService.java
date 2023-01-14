package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Books;

public interface IBookService extends IService<Books> {

    IPage<Books> getpage(int currentpage, int pagesSize);


}

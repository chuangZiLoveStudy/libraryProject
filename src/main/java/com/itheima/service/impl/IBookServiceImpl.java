package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.BookDao;
import com.itheima.domain.Books;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class
IBookServiceImpl extends ServiceImpl<BookDao, Books> implements IBookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public IPage<Books> getpage(int currentpage, int pagesSize) {
        IPage page = new Page(currentpage,pagesSize);
        bookDao.selectPage(page, null);
        return page;
    }
}

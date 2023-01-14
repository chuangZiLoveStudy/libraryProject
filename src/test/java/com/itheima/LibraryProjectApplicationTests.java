package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.domain.Books;
import com.itheima.service.IBookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class LibraryProjectApplicationTests {

    @Autowired
    BookDao bookDao;
    @Autowired
    IBookService iBookService;

    @Test
    void contextLoads() {
        List<Books> booksList = bookDao.selectList(null);
        System.out.println(booksList);
    }

    @Test
    void testBookservice(){
        Books serviceById = iBookService.getById(1);
        System.out.println(serviceById);
    }

}

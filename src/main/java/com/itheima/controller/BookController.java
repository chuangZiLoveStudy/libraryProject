package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.controller.utils.Result;
import com.itheima.domain.Books;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @PostMapping
    public Result save(@RequestBody Books books){
        boolean flag = iBookService.save(books);
        return new Result(flag?1:0,flag?"添加成功":"添加失败");
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id){
        boolean flag = iBookService.removeById(id);
        return new Result(flag?1:0,flag?"删除成功":"删除失败");
    }

    @PutMapping
    public Result update(@RequestBody Books books){
        boolean flag = iBookService.updateById(books);
        return new Result(flag?1:0,flag?"修改成功":"修改失败");
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        Books book = iBookService.getById(id);
        return new Result(1,book,"查询成功");
    }

    @GetMapping
    public Result getAll(){
        List<Books> list = iBookService.list();
        return new Result(1,list,"查询成功");
    }

    @GetMapping("/{currentpage}/{pagesSize}")
    public Result getpage(@PathVariable int currentpage,@PathVariable int pagesSize){
        IPage<Books> booksIPage = iBookService.getpage(currentpage, pagesSize);
        return new Result(1,booksIPage,"查询成功");
    }




}

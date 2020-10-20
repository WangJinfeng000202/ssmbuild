package com.wjf.dao;

import com.wjf.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookDao {

    int addBook(Book book);

    int deleteBookById(@Param("bookId") Integer id);

    int updateBook(Book book);

    Book queryById(@Param("bookId") Integer id);

    List<Book> queryAllBooks();
}

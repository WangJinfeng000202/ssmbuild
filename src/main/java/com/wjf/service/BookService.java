package com.wjf.service;

import com.wjf.pojo.Book;

import java.util.List;

public interface BookService {
    int addBook(Book book);

    int deleteBookById(Integer id);

    int updateBook(Book book);

    Book queryById(Integer id);

    List<Book> queryAllBooks();
}

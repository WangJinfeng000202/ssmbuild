package com.wjf.service;

import com.wjf.dao.BookDao;
import com.wjf.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    /**
     * service层调用dao层
     */
    @Autowired
    private BookDao bookDao;

    public int addBook(Book book) {
        return bookDao.addBook(book);
    }

    public int deleteBookById(Integer id) {
        return bookDao.deleteBookById(id);
    }

    public int updateBook(Book book) {
        return bookDao.updateBook(book);
    }

    public Book queryById(Integer id) {
        return bookDao.queryById(id);
    }

    public List<Book> queryAllBooks() {
        return bookDao.queryAllBooks();
    }
}

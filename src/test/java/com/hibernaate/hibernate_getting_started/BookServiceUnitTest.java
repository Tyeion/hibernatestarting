package com.hibernaate.hibernate_getting_started;

import com.hibernaate.hibernate_getting_started.DAO.Book;
import com.hibernaate.hibernate_getting_started.SERVICE.BookService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookServiceUnitTest {

    @Autowired
    private BookService bookService;

    @Test
    public void checkingmethod()
    {
        List<Book> books = bookService.list();
        Assert.assertEquals(books.size() , 4);
    }
}

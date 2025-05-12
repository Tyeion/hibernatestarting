package com.hibernaate.hibernate_getting_started.SERVICE;

import com.hibernaate.hibernate_getting_started.DAO.Book;
import com.hibernaate.hibernate_getting_started.REPO.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> list(){
        return bookRepository.findAll();
    }
}

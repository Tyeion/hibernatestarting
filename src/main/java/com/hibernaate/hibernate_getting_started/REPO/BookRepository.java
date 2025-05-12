package com.hibernaate.hibernate_getting_started.REPO;

import com.hibernaate.hibernate_getting_started.DAO.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}

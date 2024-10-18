package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.entity.Book;

public interface BookRepo extends JpaRepository<Book, Integer> {

}

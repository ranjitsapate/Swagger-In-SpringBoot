package com.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Book;

public interface BookRepository extends JpaRepository<Book, Serializable>{

}

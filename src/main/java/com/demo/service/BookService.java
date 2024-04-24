package com.demo.service;

import java.util.List;

import com.demo.model.Book;

public interface BookService {

	public String upsertBook(Book book);
	
	public List<Book> getAllBooks();
	
	//public String updateBook(Book book);
	
	public String deleteBook(Integer bookId);
}

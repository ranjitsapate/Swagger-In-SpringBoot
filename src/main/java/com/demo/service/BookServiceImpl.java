package com.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.model.Book;
import com.demo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	
	private BookRepository bookRepo;
	
	public BookServiceImpl(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}

	@Override
	public String upsertBook(Book book) {
		Integer bookId=book.getBookId();
		System.out.println(book);
		bookRepo.save(book);
		System.out.println(book);
		
		if(bookId==null) {
			return "Record Inserted";
		}else
			return "Record Updated";
	}

	@Override
	public List<Book> getAllBooks() {
		return bookRepo.findAll();
	}

	@Override
	public String deleteBook(Integer bookId) {
		 bookRepo.deleteById(bookId);
		 return "Book Deleted";
	}

}

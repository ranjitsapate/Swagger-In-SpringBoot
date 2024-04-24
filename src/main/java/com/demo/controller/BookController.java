package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Book;
import com.demo.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookServ;

	@PostMapping("/book")
	public ResponseEntity<String> addBook(@RequestBody Book book)
	{
		String msg=bookServ.upsertBook(book);
		return new ResponseEntity<>(msg,HttpStatus.CREATED);	
	}
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks()
	{
		List<Book> allBooks = bookServ.getAllBooks();
		return new ResponseEntity<>(allBooks,HttpStatus.OK);
	}
	
	@PutMapping("/book")
	public ResponseEntity<String> updateBook(@RequestBody Book book)
	{
		String msg=bookServ.upsertBook(book);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	
	@DeleteMapping("/book/{bookId}")
	public ResponseEntity<String> deleteBook(@PathVariable("bookId") Integer bookId)
	{
		String msg=bookServ.deleteBook(bookId);
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	
}

package com.nagarro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.entity.Book;
import com.repo.BookRepo;

/**
 * 
 * @author tanishasharma
 *
 */

@RestController
public class BookController 
{
	@Autowired
	BookRepo repo;
	
	
	@PostMapping(path="/book",consumes= {"application/json"})
	public void addBook(@RequestBody Book book) 
	
	{
		Optional<Book> check=repo.findById(book.getBookCode());
		if(check.isEmpty())
		{
		repo.save(book);
		}
		
	}
	
	@PutMapping(path="/book",consumes= {"application/json"})
	public void saveOrUpdateBook(@RequestBody Book book) 
	{
		repo.save(book);
		
	}
	
	@GetMapping(path="/book")
	public List<Book> getBooks()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/book/{bookCode}")
	public Optional<Book> getBook(@PathVariable("bookCode") int bookCode)
	{
		return repo.findById(bookCode);

	}
	
	@DeleteMapping("/book/{bookCode}")
	public void deleteBook(@PathVariable("bookCode") int bookCode)
	{
		Book a=repo.getById(bookCode);
		repo.delete(a);
		
	}
}


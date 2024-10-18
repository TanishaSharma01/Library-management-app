package com.nagarro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.entity.Author;
import com.repo.AuthorRepo;

/**
 * 
 * @author tanishasharma
 *
 */

@RestController
public class AuthorController {

	@Autowired
	AuthorRepo repo;
	
	@PostMapping(path="/author",consumes= {"application/json"})
	public ResponseEntity<String> addAuthor(@RequestBody Author author) 
	{
		String message="";
		HttpStatus httpstatus=HttpStatus.BAD_REQUEST;
		if(author.getName()!=null && author.getName().trim().length()>0) {
			repo.save(author);
			message="Author added succesfully";	
			httpstatus=HttpStatus.OK;			
		}
		
		return new ResponseEntity<>(message, httpstatus);
		
	}
	
	@PutMapping(path="/author",consumes= {"application/json"})
	public void saveOrUpdateAuthor(@RequestBody Author author) 
	{
		repo.save(author);
		
	}
	
	@GetMapping(path="/author")
	public List<Author> getAuthors()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/author/{name}")
	public Optional<Author> getAuthor(@PathVariable("name") String name)
	{
		return repo.findById(name);

	}
	
	@DeleteMapping("/author/{name}")
	public void deleteAuthor(@PathVariable("name") String name)
	{
		Author a=repo.getById(name);
		repo.delete(a);
		
	}
}

package com.javatechie.aws.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/book")
public class AwsApigatewayExampleApplication {

	private List<Book> books=new ArrayList<>();
	
	@PostMapping("/addBook")
	public Book addBook(@RequestBody Book book) {
		books.add(book);
		return book;
	}
	
	@GetMapping("/getBooks")
	public List<Book> getBooks(){
		return books;
		
	}
	public static void main(String[] args) {
		SpringApplication.run(AwsApigatewayExampleApplication.class, args);
	}

}

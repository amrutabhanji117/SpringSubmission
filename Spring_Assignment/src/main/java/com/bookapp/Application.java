package com.bookapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bookapp.model.entities.Book;
import com.bookapp.model.service.BookService;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	BookService bookService;
	public static void main(String[] args) {
		
		
		SpringApplication.run(Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
		//bookService.addBook(new Book("effective java", "asd",340.00));
//bookService.addBook(new Book("rich dad poor dad","uio", 240.00));
	//bookService.addBook(new Book("monk who sold farrari", "jkl",300.00));
	}

}

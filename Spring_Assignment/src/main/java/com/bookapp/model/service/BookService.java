package com.bookapp.model.service;

import java.util.*;

import com.bookapp.model.entities.Book;

public interface BookService {
	public List<Book> getAllBooks();
	public Book getBookById(int id);
	public Book addBook(Book book);
	public List<Book> getBookByBookName(String bookname);
	public Book updateBook(int bookId, Book book);
	public Book deleteBook(int bookId);
	
}

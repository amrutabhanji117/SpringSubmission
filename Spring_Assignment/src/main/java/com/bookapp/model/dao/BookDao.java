package com.bookapp.model.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.model.entities.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Integer>{

	public List<Book> findByBookname(String bookname);//declare the method and their definition is provided by spring data 
	
}

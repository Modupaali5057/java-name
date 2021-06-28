package org.example.demo.dao;

import java.sql.Connection;
import java.sql.SQLException;

import org.example.demo.model.Book;

public interface BookDao {
	
	//public Connection getMyConnection() throws SQLException;
	
	public Book createBook(Book book) throws SQLException;

}
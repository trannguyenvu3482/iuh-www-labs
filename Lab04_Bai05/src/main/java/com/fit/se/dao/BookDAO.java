package com.fit.se.dao;

import java.util.List;

import com.fit.se.beans.Book;

public interface BookDAO {
	public void addBook(Book book);

	public Book getBook(String id);

	public List<Book> getAllBooks();
}

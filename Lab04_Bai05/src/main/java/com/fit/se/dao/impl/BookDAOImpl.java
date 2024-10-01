package com.fit.se.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.fit.se.beans.Book;
import com.fit.se.dao.BookDAO;

public class BookDAOImpl implements BookDAO {
	private DataSource dataSource;

	public BookDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public List<Book> getAllBooks() {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			String sql = "SELECT * FROM books";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Book> books = new ArrayList<>();
			while (rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getDouble("price"));
				book.setQuantity(rs.getInt("quantity"));
				book.setImgURL(rs.getString("imgurl"));
				books.add(book);
			}
			return books;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return new ArrayList<>();
	}

	public void addBook(Book book) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			String sql = "INSERT INTO books (title, price, quantity, imgurl) VALUES (?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, book.getTitle());
			ps.setDouble(2, book.getPrice());
			ps.setInt(3, book.getQuantity());
			ps.setString(4, book.getImgURL());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public Book getBook(String id) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = dataSource.getConnection();
			String sql = "SELECT * from books WHERE id = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, Integer.parseInt(id));
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setPrice(rs.getDouble("price"));
				book.setQuantity(rs.getInt("quantity"));
				book.setImgURL(rs.getString("imgurl"));
				return book;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
}

package com.furniture.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.furniture.connection.ConnectionManager;

public class ProductsDao {

	public static final Connection conn = ConnectionManager.getConnection();
	
//	private static String SELECT_ALL_BOOKS = "select * from book";
	
//public List<Book> getAllBooks() {
//		
//		List<Book> allBooks = new ArrayList<Book>();
//		
//		try(PreparedStatement pstmt = conn.prepareStatement(SELECT_ALL_BOOKS);
//				ResultSet rs = pstmt.executeQuery() ) {
//			
//			while(rs.next()) {
//				
//				String isbn = rs.getString("isbn");
//				String title = rs.getString("title");
//				String descr = rs.getString("descr");
//				int rented = rs.getInt("rented");
//				Date added_to_library = rs.getDate("added_to_library");
//				
//				allBooks.add(new Book(isbn, title, descr, rented, added_to_library));
//				
//			}
//			
//		} catch(SQLException e) {
//			e.printStackTrace();
//		}
//		
//		return allBooks;
//	}

	
	
}

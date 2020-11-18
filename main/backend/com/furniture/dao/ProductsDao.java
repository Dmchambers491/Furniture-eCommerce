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
	
	private static String SELECT_ALL_PRODUCTS = "select * from furniture";
	
public List<ProductsModel> getAllFurniture() {
		
		List<ProductsModel> allFurniture = new ArrayList<ProductsModel>();
		
		try(PreparedStatement pstmt = conn.prepareStatement(SELECT_ALL_FURNITURE);
				ResultSet rs = pstmt.executeQuery() ) {
			
			while(rs.next()) {
				
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String description = rs.getString("description");
				String price = rs.getString("price");
				String picture = rs.getString("picture");
				
				allFurniture.add(new ProductsModel(isbn, title, descr, rented, added_to_library));
				
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return allFurniture;
	}

	
	
}

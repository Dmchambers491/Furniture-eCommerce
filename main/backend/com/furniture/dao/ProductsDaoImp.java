package com.furniture.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
 
import javax.sql.DataSource;
 
import net.codejava.spring.model.Contact;
 
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
 
/**
 * An implementation of the ContactDAO interface.
 * @author www.codejava.net
 *
 */
public class ProductsDAOImpl implements ProductsDAO {
 
    private JdbcTemplate jdbcTemplate;
 
    public ContactDAOImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
 
    @Override
    public void saveOrUpdate(ProductsModel furniture) {

    
    }
 
    @Override
    public void delete(int contactId) {

    }
 
    @Override
    public List<ProductsModel> list() {

    }
 
    @Override
    public Contact get(int contactId) {

    
    }
 
}
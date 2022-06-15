package com.price.service.Dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.price.service.Entity.Price;
import com.price.service.RowMapper.PriceRowMapper;

@Repository
public class PriceDao implements IPriceDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate = new JdbcTemplate();
	

	private final String sql = "SELECT PRODUCT_ID, BRAND_ID, PRICE_LIST, START_DATE, END_DATE, PRICE, PRIORITY FROM price WHERE PRODUCT_ID=? AND BRAND_ID=? and ? BETWEEN START_DATE AND END_DATE order by PRIORITY DESC";	
	
	
	@Override
	public Price buscarByParametros(String fecha_aplicacion, int grupo_id, int producto_id){
			List<Price> prices = jdbcTemplate.query(sql, new PreparedStatementSetter() {
            public void setValues(PreparedStatement preparedStatement) throws SQLException {
               preparedStatement.setInt(1, producto_id);
               preparedStatement.setInt(2, grupo_id);
               preparedStatement.setString(3, fecha_aplicacion);
            }
         },
			 new PriceRowMapper());
	         return prices.get(0);
	}
}

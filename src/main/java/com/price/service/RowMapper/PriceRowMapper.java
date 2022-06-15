package com.price.service.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
  
import org.springframework.jdbc.core.RowMapper;

import com.price.service.Entity.Price;
  
public class PriceRowMapper implements RowMapper<Price>{
  
    @Override
    public Price mapRow(ResultSet rs, int map) throws SQLException {
    	Price price = new Price();
        price.setPRODUCT_ID(rs.getInt("PRODUCT_ID"));
        price.setBRAND_ID(rs.getInt("BRAND_ID"));
        price.setPRICE(rs.getFloat("PRICE"));
        price.setSTART_DATE(rs.getString("START_DATE"));
        price.setEND_DATE(rs.getString("END_DATE"));
        price.setPRICE_LIST(rs.getInt("PRICE_LIST"));
		return price;
    }
}

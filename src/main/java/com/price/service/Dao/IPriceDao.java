package com.price.service.Dao;

import java.sql.SQLException;

import com.price.service.Entity.Price;

public interface IPriceDao {
	public Price buscarByParametros(String fecha_aplicacion, int grupo_id, int producto_id) throws SQLException;
}

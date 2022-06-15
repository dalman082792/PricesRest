package com.price.service.Service;


import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.price.service.Dao.PriceDao;
import com.price.service.Entity.Price;

@Service
public class PriceService implements IPriceServ{

	@Autowired
	private PriceDao dao = new PriceDao();

	@Override
	public Price buscarByParametros(String fecha_aplicacion, int grupo_id, int producto_id) throws SQLException{
			Price price = dao.buscarByParametros(fecha_aplicacion, grupo_id, producto_id);
			return price;
	}
}

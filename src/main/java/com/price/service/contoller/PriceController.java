package com.price.service.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.price.service.Entity.Price;
import com.price.service.Service.PriceService;

@RestController
@RequestMapping("/api/pvp")
public class PriceController {
	
	@Autowired 
	private PriceService priceService;
	
	@GetMapping("/price")
	public ResponseEntity<Price> obtenerPresioByParametros(@RequestParam ("fecha_aplicacion")String fecha_aplicacion,@RequestParam ("grupo_id") int grupo_id, @RequestParam("producto_id")int producto_id){
		try {
			Price prices = priceService.buscarByParametros(fecha_aplicacion, grupo_id, producto_id);
			return new ResponseEntity<Price>(prices,HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Price>(HttpStatus.BAD_REQUEST);
		}			 
	}
}

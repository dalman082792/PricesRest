package com.price.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class PriceRestApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(PriceRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		template.execute("DROP TABLE PRICE IF EXISTS");
		template.execute("CREATE TABLE PRICE(BRAND_ID INTEGER,START_DATE DATETIME, END_DATE DATETIME, PRICE_LIST INTEGER, PRODUCT_ID INTEGER, PRIORITY INTEGER, PRICE FLOAT, CURR VARCHAR(5))");
		
		template.update("INSERT INTO PRICE VALUES (1,'2020-06-14T00:00:00','2020-12-31T23:59:59',1,35455,0,35.50,'EUR')");
		template.update("INSERT INTO price VALUES (1,'2020-06-14T15:00:00','2020-06-14T18:30:00',2,35455,1,25.45,'EUR')");
		template.update("INSERT INTO price VALUES (1,'2020-06-15T00:00:00','2020-06-15T11:00:00',3,35455,1,30.50,'EUR')");
		template.update("INSERT INTO price VALUES (1,'2020-06-15T16:00:00','2020-12-31T23:59:59',4,35455,1,38.95,'EUR')");
	}

}

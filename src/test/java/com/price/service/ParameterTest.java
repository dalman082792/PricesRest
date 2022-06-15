package com.price.service;

public class ParameterTest {
	private String fecha_aplicacion;
	private double price;
	private Integer brand_id;
	private String start_date;
	private String end_date;
	private int price_list;
	private Integer product_id;
	public String getFecha_aplicacion() {
		return fecha_aplicacion;
	}
	public void setFecha_aplicacion(String fecha_aplicacion) {
		this.fecha_aplicacion = fecha_aplicacion;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(Integer brand_id) {
		this.brand_id = brand_id;
	}
	public String getStart_date() {
		return start_date;
	}
	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getEnd_date() {
		return end_date;
	}
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	public int getPrice_list() {
		return price_list;
	}
	public void setPrice_list(int price_list) {
		this.price_list = price_list;
	}
	public ParameterTest() {
		super();
	}
	public ParameterTest(String fecha_aplicacion, double price, Integer brand_id,
			String start_date, String end_date, int price_list, Integer product_id) {
		super();
		this.fecha_aplicacion = fecha_aplicacion;
		this.price = price;
		this.brand_id = brand_id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.price_list = price_list;
		this.product_id = product_id;
	}
	public Integer getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}
}

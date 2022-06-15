package com.price.service;

public class ParameterTest {
	private String fecha_aplicacion;
	private String grupo_id;
	private String producto_id;
	private double price;
	private int brand_id;
	private String start_date;
	private String end_date;
	private int price_list;
	private int product_id;
	public String getFecha_aplicacion() {
		return fecha_aplicacion;
	}
	public void setFecha_aplicacion(String fecha_aplicacion) {
		this.fecha_aplicacion = fecha_aplicacion;
	}
	public String getGrupo_id() {
		return grupo_id;
	}
	public void setGrupo_id(String grupo_id) {
		this.grupo_id = grupo_id;
	}
	public String getProducto_id() {
		return producto_id;
	}
	public void setProducto_id(String producto_id) {
		this.producto_id = producto_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBrand_id() {
		return brand_id;
	}
	public void setBrand_id(int brand_id) {
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
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public ParameterTest() {
		super();
	}
	public ParameterTest(String fecha_aplicacion, String grupo_id, String producto_id, double price, int brand_id,
			String start_date, String end_date, int price_list, int product_id) {
		super();
		this.fecha_aplicacion = fecha_aplicacion;
		this.grupo_id = grupo_id;
		this.producto_id = producto_id;
		this.price = price;
		this.brand_id = brand_id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.price_list = price_list;
		this.product_id = product_id;
	}
	
}

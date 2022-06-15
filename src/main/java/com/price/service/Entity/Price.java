package com.price.service.Entity;

public class Price {
	
	private int BRAND_ID;
	private String START_DATE;
	private String END_DATE;
	private int PRICE_LIST;
	private int PRODUCT_ID;
	private float PRICE;
	public int getBRAND_ID() {
		return BRAND_ID;
	}
	public void setBRAND_ID(int bRAND_ID) {
		BRAND_ID = bRAND_ID;
	}
	public String getSTART_DATE() {
		return START_DATE;
	}
	public void setSTART_DATE(String sTART_DATE) {
		START_DATE = sTART_DATE;
	}
	public String getEND_DATE() {
		return END_DATE;
	}
	public void setEND_DATE(String eND_DATE) {
		END_DATE = eND_DATE;
	}
	public int getPRICE_LIST() {
		return PRICE_LIST;
	}
	public void setPRICE_LIST(int pRICE_LIST) {
		PRICE_LIST = pRICE_LIST;
	}
	public int getPRODUCT_ID() {
		return PRODUCT_ID;
	}
	public void setPRODUCT_ID(int pRODUCT_ID) {
		PRODUCT_ID = pRODUCT_ID;
	}
	public float getPRICE() {
		return PRICE;
	}
	public void setPRICE(float price) {
		PRICE = price;
	}
	public Price() {
		super();
	}
	public Price(int bRAND_ID, String sTART_DATE, String eND_DATE, int pRICE_LIST, int pRODUCT_ID,
			float pRICE) {
		super();
		BRAND_ID = bRAND_ID;
		START_DATE = sTART_DATE;
		END_DATE = eND_DATE;
		PRICE_LIST = pRICE_LIST;
		PRODUCT_ID = pRODUCT_ID;
		PRICE = pRICE;
	}
}

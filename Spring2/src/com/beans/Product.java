package com.beans;
import java.io.Serializable;


public class Product implements Serializable{

	
		private int prodId;
		private double prodPrice;
		private String prodName;
		
		public Product() {
		System.out.println("Constructor invoked..");
		}

		public int getProdId() {
			return prodId;
		}

		public void setProdId(int prodId) {
			this.prodId = prodId;
		}

		public double getProdPrice() {
			return prodPrice;
		}

		public void setProdPrice(double prodPrice) {
			this.prodPrice = prodPrice;
		}

		public String getProdName() {
			return prodName;
		}

		public void setProdName(String prodName) {
			this.prodName = prodName;
		}
		

}

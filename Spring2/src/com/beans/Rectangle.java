package com.beans;

public class Rectangle
{
	private int len;
	private int bre;
	
	public int getLen() {
		return len;
	}
	public void setLen(int len) {
		this.len = len;
	}
	public int getBre() {
		return bre;
	}
	public void setBre(int bre) {
		this.bre = bre;
	}
	public Rectangle()
	{
		System.out.println("this is rectangle");
	}
}

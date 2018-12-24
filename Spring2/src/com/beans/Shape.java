package com.beans;
import java.io.Serializable;

public class Shape implements Serializable
{

	private Triangle triangle;
	private Rectangle rectangle;
	
	
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Rectangle getRectangle() {
		return rectangle;
	}
	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	
	public Shape()
	{
		System.out.println("This is shape");
	}
}

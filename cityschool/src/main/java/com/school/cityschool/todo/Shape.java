package com.school.cityschool.todo;

public class Shape {
	 
	public void draw()
	{
		System.out.println("Drawing Shape");
	}
	public static void main(String[] args) {
		Shape s=new Rectangle();
		s.draw();
		
		s=new Circle();
		s.draw();
	}
 
}
class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}
	}
 
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
}
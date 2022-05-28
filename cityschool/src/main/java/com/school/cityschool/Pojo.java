package com.school.cityschool;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pojo {
	private String name;
	
	
	private Pojo()
	 {
		 System.out.println("object is created.......");
	 }
	public void execute()
	{
		System.out.println(" name: "+name);
	}
	public void init1()
	{  
		System.out.println("init method is running.......");
	}
	public void init2()
	{
		System.out.println("init2 method is running.......");
	}
	public void destroy1()
	{
		System.out.println("destroy method is running.......");
	}
}

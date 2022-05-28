package com.school.cityschool.todo;

import java.util.Arrays;
import java.util.List;

public class ToDoMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder();
		Integer array[] = { 1, 2, 3, 5, 6, 8, 9 };
		
		List<Integer> list = Arrays.asList(array);
	     
		for(int j=0;j<10;j++) {
		     
			if(!(list.contains(j))){
		    
				sb .append(j+",");					        
			}
	        }
		System.out.println("Missing : "+ sb);
	 }
}
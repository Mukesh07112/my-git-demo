package com.cts;

import com.cts.service.Someservice;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Welcome");
		System.out.println("hello mukesh");
		
		Someservice ss=new Someservice();
		System.out.println(ss.findLength("Program"));
		
		}

}

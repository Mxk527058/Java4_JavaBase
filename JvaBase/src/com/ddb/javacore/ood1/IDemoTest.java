package com.ddb.javacore.ood1;

public class IDemoTest {

	public static void main(String[] args) {
		IStudent student = new StudentImpl();
		student.study();
		student.study("Java");
		student.study("Php");
		student.study("Python");
		
		
	}

}

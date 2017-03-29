package com.ddb.javacore.Demo1;

import java.util.Scanner;

public class ArrayDemo2 {

	private static int p;

	public static void main(String[] args) {
	int[] scor = new int[10];
	int sum = 0;
	double avg;
	Scanner input = new Scanner(System.in);{
	sum = sum + scor[p];
	System.out.println("请输入10位学生的成绩 : ");
	for (int p = 0; p < scor.length; p++) {
		scor[p] = input.nextInt();
	}}
	System.out.println("10位学生成绩的总和 : "+ sum);
    
    System.out.println("十位学生成绩的平均值 : " + (double)sum/scor.length);
	}


}

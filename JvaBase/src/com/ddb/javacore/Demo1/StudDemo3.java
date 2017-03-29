package com.ddb.javacore.Demo1;

import java.util.Scanner;

public class StudDemo3 {
private static int i;

public static void main(String[] args){
	//求和平均数第二种方法:使用循环来求平均数
	int[] score = new int [10];
	int sum=0;
	Scanner input = new Scanner(System.in);
	score[i] = input.nextInt();
		for (int i= 0; i < score.length; i ++ ){
			sum = sum + score[i];
		System.out.println("请输入成绩: ");
		System.out.println("总和: " + sum );
		System.out.println("使用循环得到的平均数" + (double)sum/score.length);
	    
		}
	
	
}
}

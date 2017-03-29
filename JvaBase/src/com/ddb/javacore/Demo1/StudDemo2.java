package com.ddb.javacore.Demo1;

import java.util.Scanner;
public class StudDemo2 {

	//private Object score{

public static void StudDemo2(String[] args) {
	
		//求和方式第一种方法
		int[] score = new int [10];
		score[0] = 60;
		score[1] = 65;
		score[2] = 90;
		score[3] = 70;
		score[4] = 80;
		score[5] = 60;
		score[6] = 85;
		score[7] = 75;
		score[8] = 50;
		score[9] = 30;
		
		double avg;
		avg = (score[0] + score[1] + score[2] + score[3] + score[4] + score[5] + score[6] + score[7] + score[8] + score[9])/score.length;
		System.out.println("求和平均数是: " + avg );
}}
			
	//数组分配空间
	/*int[] score = new int[10];
	Scanner input = new Scanner(System.in);
	score[] = input.nextInt();
	System.out.println("请输入数组的十个元素 ： ");
	for (int i = 0; i < score.length; i++) {
		score[i] = input.nextInt();*/

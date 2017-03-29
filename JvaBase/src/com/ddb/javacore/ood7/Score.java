package com.ddb.javacore.ood7;

import java.util.Scanner;

public class Score implements prt {
public static void main(String[] args){
	/*int[] score = {60,80,90,70,85};
	double avg;
	avg = (score[0] + score[1] + score[2] + score[3] + score[4])/5;
	System.out.println("avg: " + avg);*/
   
	//声明数组
	int[] score;
	//数组分配空间
	score = new int[5];
	Scanner input = new Scanner(System.in);
	for (int i = 0; i < score.length; i++) {
	
	} 
		
	
	//给数组指定格子赋值
	score[0] = 60;
	score[1] = 80;
	score[2] = 90;
	score[3] = 70;
	score[4] = 65;
	
//使用数组中的元素，使用下标去赋值
System.out.println("score[0] " + score[0] + ";");
System.out.println("score[1] " + score[1] + ";");
System.out.println("score[2] " + score[2] + ";");
System.out.println("score[3] " + score[3] + ";");
System.out.println("score[4] " + score[4] + ";");
	
	
	
	
	/*int[] score = new int[5];   //声明数组并分配空间
	double avg;
	
	score[0] = 60;
	score[1] = 80;
	score[2] = 90;
	score[3] = 70;
	score[4] = 65;
	avg =(double) (score[0] + score[1] + score[2] + score[3] + score[4])/5;
	System.out.println("平均数: " + avg);*/
	
	//使用循环取值并输出
	for (int i = 0; i < score.length; i++) {
	System.out.println("score[" + i + "] =" + score[i] + " ;");
	
	
	//求平均数
	double avg = 0.00;
	
	//逐个相加求平均数
	avg = (score[0] + score[1] + score[2] + score[3] + score[4])/score.length;
	
	}	
	
}




}

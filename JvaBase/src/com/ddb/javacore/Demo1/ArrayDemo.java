package com.ddb.javacore.Demo1;
import static java.lang.System.out;

import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		//声明数组
		int[] score;
		//数组分配空间
		//score = new int[5];
		
		int[] score1 = new int[5];   //声明并分配空间
		Scanner input = new Scanner(System.in);
		System.out.println("请输入数组的5个元素值 : ");
		for (int i = 0; i < score1.length; i++) {
			score1[i] = input.nextInt();
		}
		
		//给数组指定格子赋值
		/*score[0]=65;       //给第一个元素位，赋值。下标从0开始。
		score[1]=60;
		score[2]=75;
		score[3]=55;
		score[4]=80;*/
		
		//使用数组中的元素，使用下标去取值
		System.out.println("逐个手写输出 : ");
		System.out.println("score[0] = " + score1[0] + " ; ");
		System.out.println("score[1] = " + score1[1] + " ; ");
		System.out.println("score[2] = " + score1[2] + " ; ");
		System.out.println("score[3] = " + score1[3] + " ; ");
		System.out.println("score[4] = " + score1[4] + " ; ");
		
		
		//使用循环取值并输出
		System.out.println("逐个循环输出: ");
		for (int i = 0; i < score1.length; i++) {
			System.out.println("score[" +i+ "] = " + score1[i] + " ; ");
		}
		
		//求平均数
		double avg = 0.00;
		avg = (double)(score1[0] + score1[1] + score1[2] + score1[3] + score1[4] )/score1.length;
		System.out.println("求和平均数是: " + avg );
		
		//使用循环来求平均数
		int sum = 0;
		for (int i = 0; i < score1.length; i++) {
			sum = sum + score1[i];	
		}
		System.out.println("总和 : " + sum);
		System.out.println("使用循环求得的平均数: " + (double)sum/score1.length);
	}
}

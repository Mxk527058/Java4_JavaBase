package com.ddb.javacore.Demo1;

import java.util.Scanner;

public class StudDemo3 {
private static int i;

public static void main(String[] args){
	//���ƽ�����ڶ��ַ���:ʹ��ѭ������ƽ����
	int[] score = new int [10];
	int sum=0;
	Scanner input = new Scanner(System.in);
	score[i] = input.nextInt();
		for (int i= 0; i < score.length; i ++ ){
			sum = sum + score[i];
		System.out.println("������ɼ�: ");
		System.out.println("�ܺ�: " + sum );
		System.out.println("ʹ��ѭ���õ���ƽ����" + (double)sum/score.length);
	    
		}
	
	
}
}

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
	System.out.println("������10λѧ���ĳɼ� : ");
	for (int p = 0; p < scor.length; p++) {
		scor[p] = input.nextInt();
	}}
	System.out.println("10λѧ���ɼ����ܺ� : "+ sum);
    
    System.out.println("ʮλѧ���ɼ���ƽ��ֵ : " + (double)sum/scor.length);
	}


}

package com.ddb.javacore.Demo1;
import static java.lang.System.out;

import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		//��������
		int[] score;
		//�������ռ�
		//score = new int[5];
		
		int[] score1 = new int[5];   //����������ռ�
		Scanner input = new Scanner(System.in);
		System.out.println("�����������5��Ԫ��ֵ : ");
		for (int i = 0; i < score1.length; i++) {
			score1[i] = input.nextInt();
		}
		
		//������ָ�����Ӹ�ֵ
		/*score[0]=65;       //����һ��Ԫ��λ����ֵ���±��0��ʼ��
		score[1]=60;
		score[2]=75;
		score[3]=55;
		score[4]=80;*/
		
		//ʹ�������е�Ԫ�أ�ʹ���±�ȥȡֵ
		System.out.println("�����д��� : ");
		System.out.println("score[0] = " + score1[0] + " ; ");
		System.out.println("score[1] = " + score1[1] + " ; ");
		System.out.println("score[2] = " + score1[2] + " ; ");
		System.out.println("score[3] = " + score1[3] + " ; ");
		System.out.println("score[4] = " + score1[4] + " ; ");
		
		
		//ʹ��ѭ��ȡֵ�����
		System.out.println("���ѭ�����: ");
		for (int i = 0; i < score1.length; i++) {
			System.out.println("score[" +i+ "] = " + score1[i] + " ; ");
		}
		
		//��ƽ����
		double avg = 0.00;
		avg = (double)(score1[0] + score1[1] + score1[2] + score1[3] + score1[4] )/score1.length;
		System.out.println("���ƽ������: " + avg );
		
		//ʹ��ѭ������ƽ����
		int sum = 0;
		for (int i = 0; i < score1.length; i++) {
			sum = sum + score1[i];	
		}
		System.out.println("�ܺ� : " + sum);
		System.out.println("ʹ��ѭ����õ�ƽ����: " + (double)sum/score1.length);
	}
}

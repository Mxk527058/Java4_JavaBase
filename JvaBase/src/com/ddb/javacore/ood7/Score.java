package com.ddb.javacore.ood7;

import java.util.Scanner;

public class Score implements prt {
public static void main(String[] args){
	/*int[] score = {60,80,90,70,85};
	double avg;
	avg = (score[0] + score[1] + score[2] + score[3] + score[4])/5;
	System.out.println("avg: " + avg);*/
   
	//��������
	int[] score;
	//�������ռ�
	score = new int[5];
	Scanner input = new Scanner(System.in);
	for (int i = 0; i < score.length; i++) {
	
	} 
		
	
	//������ָ�����Ӹ�ֵ
	score[0] = 60;
	score[1] = 80;
	score[2] = 90;
	score[3] = 70;
	score[4] = 65;
	
//ʹ�������е�Ԫ�أ�ʹ���±�ȥ��ֵ
System.out.println("score[0] " + score[0] + ";");
System.out.println("score[1] " + score[1] + ";");
System.out.println("score[2] " + score[2] + ";");
System.out.println("score[3] " + score[3] + ";");
System.out.println("score[4] " + score[4] + ";");
	
	
	
	
	/*int[] score = new int[5];   //�������鲢����ռ�
	double avg;
	
	score[0] = 60;
	score[1] = 80;
	score[2] = 90;
	score[3] = 70;
	score[4] = 65;
	avg =(double) (score[0] + score[1] + score[2] + score[3] + score[4])/5;
	System.out.println("ƽ����: " + avg);*/
	
	//ʹ��ѭ��ȡֵ�����
	for (int i = 0; i < score.length; i++) {
	System.out.println("score[" + i + "] =" + score[i] + " ;");
	
	
	//��ƽ����
	double avg = 0.00;
	
	//��������ƽ����
	avg = (score[0] + score[1] + score[2] + score[3] + score[4])/score.length;
	
	}	
	
}




}

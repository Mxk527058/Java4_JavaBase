package com.ddb.javacore.branch;

import java.util.Scanner;

public class BranchifDemo {

	public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in);
		 * System.out.println("请输入一个分数: "); int score = input.nextInt();
		 */
		int country = 1;
		int privince = 2;
		/*
		 * if (country ==1){ System.out.println("你是中国人!");
		 * 
		 * if(privince ==2 ){ System.out.println("你是安徽人!");
		 * }else(System.out.println("你是外省人!"); )
		 * 
		 * }else ( System.out.println("你是外国人!"); )
		 */
		// int result = 4 >5 ? (1+2) : (2-1);
		System.out.println("原country : " + country);
		System.out.println("原privince : " + country);
		// int result = 4>5 ? country++ : prnvince++;
		int result = 5 > 3 ? country++ : privince++;
		System.out.println("result : " + result);
		System.out.println("后country : " + country);
		System.out.println("后privince : " + privince);

	}
}

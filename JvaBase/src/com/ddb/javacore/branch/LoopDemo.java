package com.ddb.javacore.branch;

public static void forMutiV(){
	PrintStream out = System.out;
	out.println("For muti-v demo: ");
	//for (int i = 1,j=9; (i <= 9)&&(j<=9); i++,j--) {
	for (int i = 1,j=20; i <= 9; i++,j-=2) {			//j-=2，使用自定义的增减步长
		out.print(j+ " * "+ i +" = " + i * j + "\t");
	}
out.println(); 
System.out.println();
}

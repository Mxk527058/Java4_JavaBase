package com.ddb.javacore.ood1;

public class StudentImpl implements IStudent {

	@Override
	public void study() {
		System.out.println("����ѧ��������ѧϰ! ");

	}

	@Override
	public void study(String java) {
		System.out.println("������ѧϰ: "+ java );
	}

}

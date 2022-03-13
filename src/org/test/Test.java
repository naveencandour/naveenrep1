package org.test;

public  class Test {
	
	public int sueYou(int num) {
		int a = num ,b=0;
		while (a>0) {
			a=a/10;
			b++;
		}
		return b;
		
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		int i = test.sueYou(12345);
		System.out.println(i);
		
		
	}
	

}

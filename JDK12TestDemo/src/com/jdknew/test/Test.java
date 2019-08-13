package com.jdknew.test;

public class Test {
	
	public final static int ONE=1;
	public final static int TWO=2;
	public final static int THREE=3;
	public final static int FOUR=4;
	public final static int FIVE=5;
	
	public static void testSwitch(int a) {
		switch(a) {
			case ONE -> System.out.println("1");
			case TWO -> System.out.println("2");
			case THREE -> System.out.println("3");
			case FOUR -> System.out.println("4");
			case FIVE -> System.out.println("5");
		}
	}
	
	public static void main(String[] args) {
		testSwitch(5);
	}
}

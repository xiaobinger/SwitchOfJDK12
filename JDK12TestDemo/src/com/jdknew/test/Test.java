package com.jdknew.test;

import java.util.function.Function;

public class Test {
	
	public final static int ONE=1;
	public final static int TWO=2;
	public final static int THREE=3;
	public final static int FOUR=4;
	public final static int FIVE=5;
	
	public static void testSwitch(int a) {
		switch(a) {//case 可以引用表达式
			case ONE -> System.out.println("1");
			case TWO -> System.out.println("2");
			case THREE -> System.out.println("3");
			case FOUR -> System.out.println("4");
			case FIVE -> System.out.println("5");
		}
	}
	
	/**
	 * String支持transform、indent操作
	 * 将字符串转化成想要的结果
	 * @param str
	 */
	public static void testStringTransform(String str) {
		System.out.println(str.transform(new Function<String, String>() {

			@Override
			public String apply(String t) {
				// TODO Auto-generated method stub
				/*
				 * indent(n):n>0 每一行前面增加n个空格符；
				 * n<0去掉每一行前面的n个空格符，如果不够n个空格符则删掉全部空格符；
				 * n=0保持不变
				 */
				return t.indent(-3);
			}
			
		}));
	}
	
	
	public static void main(String[] args) {
		//testSwitch(5);
		testStringTransform("   miss you");
	}
}

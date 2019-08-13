package com.jdknew.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Function;


public class Test {
	
	public final static int ONE=1;
	public final static int TWO=2;
	public final static int THREE=3;
	public final static int FOUR=4;
	public final static int FIVE=5;
	
	
	/**
	 * switch不仅可以作为语句，也可以作为表达式存在
	 * @param a
	 */
	public static void testSwitch(int a) {
		int result=switch(a) {
			case ONE -> 1;
			case TWO -> 2;
			case THREE -> 3;
			case FOUR -> 4;
			case FIVE -> 5;
			default -> 0;
		};
		System.out.println(result);
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
	
	
	/**
	 * Files新增mismatch方法
	 * 比较两个文件，返回第一个不一样的字节位置，若没有不一样的，则返回-1L
	 * @param f1 
	 * @param f2
	 */
	public static void testFileMismatch(File f1,File f2) {
		try {
			System.out.println(Files.mismatch(Path.of(f1.getPath()), Path.of(f2.getPath())));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		testSwitch(5);
		//testStringTransform("   miss you");
		
		try {
			FileWriter w1=new FileWriter("d:\\temp1.txt");
			w1.write("a");
			w1.write("b");
			w1.write("c");
			w1.close();
			
			FileWriter w2=new FileWriter("d:\\temp2.txt");
			w2.write("a");
			w2.write("b");
			w2.write("c");
			w2.close();
			testFileMismatch(new File("d:\\temp1.txt"), new File("d:\\temp2.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

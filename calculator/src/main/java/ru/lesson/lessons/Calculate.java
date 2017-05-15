package ru.lesson.lessons;

import java.lang.Math;

public class Calculate{
	public static void main (String[] args){
		String action = args[0];
		int first = Integer.valueOf(args[1]);
		int second = Integer.valueOf(args[2]);
		int result = 0;
		switch (action){
			case "sum": result = first + second;
				break;
			case "sub": result = first - second;
				break;
			case "div": result = first / second;
				break;
			case "mult": result = first * second;
				break;
			case "pow": result = (int)Math.pow(first , second);
				break;
		}
		int sum = first + second;
		System.out.println("result = " + result);
	}
}
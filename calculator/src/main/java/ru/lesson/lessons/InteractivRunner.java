package ru.lesson.lessons;

import ru.lesson.lessons.exception.CalcArgException;

import java.util.Scanner;

/**
Класс для запуска калькулятора и поддержания ввода пользователя
*/
public class InteractivRunner{

	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		Calculator calc = new Calculator();
		String exit = "no";
		while ("no".equals(exit)){
			
			System.out.print("Enter first arg: ");
			int first = scan.nextInt();
			System.out.print("Enter second arg: ");
			int second = scan.nextInt();
			System.out.print("Enter arifmetic: ");
			String arifmetic = scan.next();
			switch (arifmetic){
				case "+": {
					calc.add(first, second);
					break;
				}
				case "-": {
					calc.sub(first, second);
					break;
				}
				case "*": {
					calc.mult(first, second);
					break;
				}
				case "/": {
                    try {
                        calc.div(first, second);
                    } catch (CalcArgException e) {
                        System.out.println("Sorry,");
                        System.out.println(e.getMessage());
                    }
                    break;
				}
				case "^": {
                    try {
                        calc.pow(first, second);
                    } catch (CalcArgException e) {
                        System.out.println("Sorry,");
                        System.out.println(e.getMessage());
                    }
                    break;
				}
			}
			
			calc.add(first, second);
			int result = calc.getResult();
			System.out.println("Result: " + result);
			System.out.print("Exit (yes/no): ");
			exit = scan.next();
			if ("no".equals(exit)){
				System.out.print("Clean result?(y/n): ");
				if ("y".equals(scan.next())){
					calc.cleanResult();
				}
			}
			
		}
	}
}
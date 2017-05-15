package ru.lesson.lessons;

/**
Класс для запуска калькулятора с данными из параметров запуска класса
параметры вводятся в следующем порядке: 
действие (sum - суммирование, sub - вычитание, mult - умножение, div - деление, pow - возведение в степень)
*/
public class ArgsRunner{

	public static void main (String[] args){
		Calculator calc = new Calculator();
		int first = Integer.valueOf(args[1]);
		int second = Integer.valueOf(args[2]);
		String arifmetic = "";
		switch (args[0]){
			case "sum": {
				calc.add(first, second);
				arifmetic = " + ";
				break;
			}
			case "sub": {
				calc.sub(first, second);
				arifmetic = " - ";
				break;
			}
			case "mult": {
				calc.mult(first, second);
				arifmetic = " * ";
				break;
			}
			case "div": {
				calc.div(first, second);
				arifmetic = " / ";
				break;
			}
			case "pow": {
				calc.pow(first, second);
				arifmetic = " ^ ";
				break;
			}
		}
		System.out.print(args[1] + arifmetic + args[2] + " = " + calc.getResult());
	}
}

package ru.lesson.lessons;

import ru.lesson.lessons.exception.CalcArgException;

import java.util.Arrays;
import java.lang.Math;


/**
* Класс реализует калькулятор
*/

public class Calculator {
	/**
	результат вычисления
	*/
	private int result;
	
	/**
	Суммируем аргументы
	@param params аргументы суммирования
	*/
	public void add (int ... params){
		for (int param : params){
			this.result += param;
		}
	}
	
	/**
	Вычитаем аргументы
	@param params вычитаемые аргументы 
	*/
	public void sub (int ... params){
		for (int param : params){
			this.result -= param;
		}
	}
	
	/**
	Умножаем на аргументы
	@param params аргументы умножения
	*/
	public void mult (int ... params){
		if (result == 0){
			params = firstIteration(params);
		}
		for (int param : params){
			this.result *= param;
		}
	}
	
	/**
	Делим аргументы
	@param params делители
	*/
	public void div (int ... params) throws CalcArgException {
		if (result == 0){
			params = firstIteration(params);
		}
		for (int param : params){
		    if (param == 0) throw new CalcArgException("You can`t divid by 0");
			this.result /= param;
		}
	}
	
	/**
	Возводим в степень
	@param params степени
	*/
	public void pow (int ... params) throws CalcArgException {
		if (result == 0){
			params = firstIteration(params);
		}
		for (int param : params){
		    if (param < 0) throw new CalcArgException("You can`t pow below 0");
			this.result = (int)Math.pow(result, param);
		}
	}
	
	/**
	Возвращает результат
	*/
	public int getResult(){
		return this.result;
	}
	
	/**
	Очистить результат вычислений
	*/
	public void cleanResult(){
		this.result = 0;
	}
	
	/**
	При result = 0, приравнивает результат первому аргументу, возвращает смещенный на 1 элемент массив
	при первоначальной инициализации объекта класса результат равен 0,
	что не позволяет проводить корректные операции для (деления, умножения, возведения в степень)
	@param args входные аргументы аргументы
	@return result смещенные на 1 аргументы 
	*/
	private int[] firstIteration(int ... args){
		this.result = args[0];
		return Arrays.copyOfRange(args,1,args.length);
	}
}
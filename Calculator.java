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
			result += param;
		}
	}
	
	/**
	Возвращает результат
	*/
	public int getResult(){
		return result;
	}
	
	/**
	Очистить результат вычислений
	*/
	public void cleanResult(){
		result = 0;
	}
}
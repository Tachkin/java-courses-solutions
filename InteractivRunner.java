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
			calc.add(first, second);
			int result = calc.getResult();
			System.out.println("Result: " + result);
			calc.cleanResult();
			System.out.print("Exit (yes/no): ");
			exit = scan.next();
			
		}
	}
}
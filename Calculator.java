package conditionalstatement;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter the first number");
		int a = sc.nextInt();
		
		System.out.println("enter the second number");
		int b = sc.nextInt();
		
		System.out.println("enter the operation");
		sc.nextLine();
		char operation = sc.nextLine().charAt(0);
		
		 
		 int  result = 0;
		switch(operation) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '/':
			result = a / b;
			break;
		case '*':
			result = a * b;
	    default:
	    	System.out.println("invalid operation");
	    	
		}
		System.out.println("your answer" + result);
		
		
		
	

	}

}

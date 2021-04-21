package whilLeLoop;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	//	%10 always gives last digit of he no.
		   int temp = n;
		   int sum = 0;
		   
		   while(temp > 0) {
			   
			   int lastdigit = temp%10;
			   temp /= 10;
			   
			   sum += lastdigit;
			   System.out.println(lastdigit + " "+ sum +" "+ temp);
		   }
		   System.out.println( sum);
		   //to find no of digits//
		  double numberofdigits = Math.log10(n)+1;
		  System.out.println(numberofdigits);
	}
	

}

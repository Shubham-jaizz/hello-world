package whilLeLoop;

import java.util.Scanner;

public class Palindromeno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	//	%10 always gives last digit of he no.
		   int temp = n;
		   int reverseno = 0;
		   
		   while(temp > 0) {
			    int lastdigit = temp%10;
			    temp /= 10;
			    reverseno = reverseno*10 + lastdigit;			    
		   }
		   if( reverseno == n) {
			   System.out.println(" palindrome");
		   }else {
			   System.out.println("not palindrome");
		   }

	}

}

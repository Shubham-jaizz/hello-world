package forLoops;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
//		for( int i = 1; i <=100; i++) {
//			if(i == 40){	
//			     break;
//			}
//			System.out.println( i );
//		}
		Scanner sc = new Scanner ( System.in);
		for(;;) {
			int a = sc.nextInt();
			
			 if( a < 0)
				 break;
			 // continue skips the current executing loop and moves to thhe next loop
		}

	}

}

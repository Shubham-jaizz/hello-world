package nestedLoop;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("*");
		
		
		for( int i = 2; i <= n ; n++) {
			System.out.print("*");
			for( int j =2;j <= i-2; j++) {
				System.out.print(" ");
			}
			System.out.print("* ");
			
			System.out.println();
			
		  }
		
				for(int k =1; k <=n ; k++) {
					System.out.print("*");
				}
					
		

	}

}

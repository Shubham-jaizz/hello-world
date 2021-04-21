package nestedLoop;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int sum = 2*n-1;
		for( int i =1;i<= sum;i++) {
			if(i<=n) {
				for(int j = 1;j<= n-i; j++) {
					System.out.print("  ");
				}
				for(int j= 1 ; j<=i; j++) {
					System.out.print("* ");
				}
				
			}
			else{
				for(int k = 1; k<= i-n; k++) {
					System.out.print("  ");
				}
				for(int k = 1; k<= 2*n-i;k++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		
		

	}

}

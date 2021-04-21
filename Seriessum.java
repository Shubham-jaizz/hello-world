package forLoops;

import java.util.Scanner;

public class Seriessum {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
//	      float result = 0;
//		for(float  i =  1; i <= n; i++ ) {
//			result += 1/i;
//		}System.out.println(result);
		float result = 0;
		for( float i = 1; i <=n; i++ ) {
			if(  i%2 == 0  ) {
				result += -1/i;
			}
	
	 else {
				result += 1/i;
			}
				
		}
		System.out.println( "your ans"+ " "+ result);
		

	} 

}
//break moves out of th loop and executes the next statement after the loop
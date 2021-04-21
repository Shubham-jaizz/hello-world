import java.util.Scanner;

public class Pracctice {
//question 6
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
//		for( int i = 1; i < n; i++) {
//			for(int k = 1; k <= n-i; k++) {
//				System.out.print("  ");
//			}
//			int k =1;
//			for( int j =1; j<= 2*i-1; j++) {
//				System.out.print( k++ +" ");
//			}
//			System.out.println();
//		}
		
		//question 7
		
//		for( int i = 1; i < n; i++) {
//			for(int k = 1; k <= n-i; k++) {
// 			System.out.print("  ");
//			}
//			 System.out.print( i + " " );
//			for( int j =1; j<= 2*i-3 ; j++) {
//				System.out.print( "0 ");
//			}
//			 if( i>=2) { 
//				 System.out.print( i+" ");
//			 }
//			
//			System.out.println();
//		}
		
		//question 8
//		for( int i = 1; i < n; i++) {
//			for(int k = 1; k <= n-i; k++) {
// 			System.out.print("  ");
//			}
//			 System.out.print( i + " " );
//			for( int j =1; j<= 2*i-3 ; j++) {
//				System.out.print( "0 ");
//			}
//			 if( i>=2) { 
//				 System.out.print( i+" ");
//			 }
//			
//			System.out.println();
//		}
		 
		//question 9 
		
		for( int i = 1; i < n; i++) {
			for(int k = 1; k <= n-i; k++) {
 			System.out.print("  ");
 			}
			 System.out.print( i + " " );
			for( int j =1; j<= 2*i-3 ; j++) {
			System.out.print( "0 ");
			}
			 if( i>=2) { 
				 System.out.print( i+" ");
			 }
			
			System.out.println();
		}
	}

}

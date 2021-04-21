import java.util.Scanner;

public class HelloGuys {
   
      //Pattern special made by shubham jaiswal syk;;;;;;;;;;;;
    public static void main(String[] arg) { 
     
    	Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
	    int sum = 2*n;
	    for( int i = 1; i <= 2*n; i++) {
	    	if(i<= n ) {
	    	          for(int k =1; k<=n-i; k++) {
	    					System.out.print("* ");
	    				}
	    			      for(int a =1; a <= i  ; a++) {
	    						System.out.print("  ");
	    					}
	    				      for(int l= 1; l<= i; l++) {
	    						System.out.print("  ");
	    					}
	    				      for( int j = 1; j<= n-i; j++) {
	    				    	  System.out.print("* ");
	    				}
	    			}
	    		
	          else {
	        	  for( int b =1; b <= i-n-1; b++) {
	        		  System.out.print("* ");
	        	      }
	    				for(int c =1; c<= 2*n-i+1;c++) {
	    					System.out.print("  ");
	    				}	    				
	    				 for(int e =1; e <= 2*n-i+1; e++) {
	    					 System.out.print("  ");
	    				 }
	    				 for( int f =1; f<= i-n-1; f++) {
	    						System.out.print("* ");
	    					}
	    					
	    		   }
	    	System.out.println();
	    	     	    				
	    		}
	    		    
	 }

	
    }	


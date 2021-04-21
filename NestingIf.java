package conditionalstatement;
import java.util.Scanner;

public class NestingIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc= new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int result = 0;
		
		if (a>b) {
		
			if(a>c) {
				  result= a;
			}else {
				result= c;
			}
		}else {
			if(b>c) {
				result = b;
			}else {
				result = c;
			}
		}
		System.out.println("the greatest number is=" +result);
		
	}

}

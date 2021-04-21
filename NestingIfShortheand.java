package conditionalstatement;

public class NestingIfShortheand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 12, b = 15, c = 5;
		int result = 0;
		
		result = a > b ? a > c ? a : c : b > c ? b :c;
		System.out.println("this is greateest number"+ result );

	}

}

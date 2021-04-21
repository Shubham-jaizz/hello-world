package arrays;

import java.util.Scanner;

public class AverageMaksOfStudents {

	public static void main(String[] args) {
		System.out.println("Enter the no of students");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
	  int[] marks = new int[n];
	  System.out.println("Enter the marks now");
	  for( int i =0 ; i < n; i++) {
		  marks[i] = sc.nextInt();
	  }
		  int average = 0;
		  for( int j= 0; j<n; j++) {
			  average += marks[j];
		  }
		  System.out.println("AVERAGE IS"+ average/n);
	  
	  

	}

}

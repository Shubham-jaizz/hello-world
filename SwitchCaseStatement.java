package conditionalstatement;

public class SwitchCaseStatement {

	public static void main(String[] args) {
		int dayOfWeek = 3;
		 
//	    if (dayOfWeek == 1) {
//	    }
//	    if (dayOfWeek == 2) {
//	    	
//	    }
//	    if (dayOfWeek == 3) {
//	    }
//	    if (dayOfWeek == 4) {
//	    	
//	    } 
//	    if (dayOfWeek == 5) {
//	    }
//	    if (dayOfWeek == 6) {
//	    	
//	    }
//	    if (dayOfWeek == 7) {
//	    }
//	    if (dayOfWeek == 8) {
//	    	
//	    }
		
		switch(dayOfWeek) {
		
		case 1:
			System.out.println("iam on leave");
		    break;
		case 2:
			System.out.println("iam in office");
			break;
		case 3:
		    System.out.println("iam going on meeeting");
		    break;
		 default:
			 System.out.println("i domt know what day it is");
		}
// withou t break it shows all the  statement if one of the line is true
	}

}

package strings;

public class StringsIntroduction {

	public static void main(String[] args) {
		String a = "Shubham is very rich guy";
		String b = new String("Shubham is very rich guy");
		System.out.println(a);
		String anothername = new String("aman");
		//function of strings
		//  identifies character at that position "char  charAt(char index)" 
		System.out.println(a.charAt(2));
		//length of array "a.length"
		System.out.println(a.length());
		// it starts printing from that position of string "String substring(intbeginIndex)"
		System.out.println(a.substring(2));
		//string substring(begining ind,ending string)
		System.out.println(a.substring(0,13));
		// tells true or false boolean "String.contains("string") 
		System.out.println(a.contains("is"));
		System.out.println(a==anothername);
		System.out.println(a.equals(b));
		//boolean isempty
		System.out.println(a.isEmpty());
		//to join two strings (String concat(String str)
//		a = a+"and very good";
//		System.out.println(a);
		System.out.println(a.concat("is very good guy"));
		//to replace any string by another "String replace(char old, char new)"
		System.out.println(a.replace('h', 'c'));
		//   it splits out the string around mentioned character "String[] split(String regex)"
		String cars = "Hyundai, Mercedes, Audi, Swift, Ferrari";
		String allCars[] = cars.split(",");
		for(String car: allCars) {
			System.out.print(car);
		}
			//gives the first position of that string " string.indexOf('char')
			System.out.println(a.indexOf("h"));
			//to convert lower case form upper case "string.tolowercase();\String.Uppercase();
			System.out.println(a.toLowerCase());
			//it remove the spaces of string "string.trim();
		    System.out.println(a.trim());
		
	}

}
//HEY GUYS WE ARE THE FUTUTRE OF UPCOMING AREA WHO IS GROWING SUCH FASTLY THAT NO ONE CAN
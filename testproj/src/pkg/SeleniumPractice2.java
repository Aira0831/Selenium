package pkg;

public class SeleniumPractice2 {
	String word=null;
	public static void main(String[] args) {
		checksstring("Aira@007");

	}
	public static void checksstring(String word) {	

		int upper = 0, lower = 0, number = 0, special = 0;
		for (int i = 0; i < word.length(); i++)
		{
			char ch=word.charAt(i);

			if (ch >='A' && ch <='Z') 
				upper++;

			else if (ch >='a' && ch <='z') 
				lower++ ;

			else if (ch >='0' && ch <='9') 
				number++;

			else
				special ++;
		}    	
		System.out.println("upper case letters count is " + upper);
		System.out.println("lower case letters count is " + lower);
		System.out.println("numbers count is " + number);
		System.out.println("special characters count is " + special);

	}

}




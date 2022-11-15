import java.util.Scanner;
public class SumASCIICode 
{

	public static void main(String[] args) 
	{
		
		//create a scanner object
		Scanner sc = new Scanner(System.in);
		
		//ask user to input four character string
		System.out.print("Enter a 4-character string: ");
		
		//Use the Scanner class's methods to read the string
		String  str= sc.nextLine();
		
		// store the first character into char by the position of string
		char character1 = str.charAt(0);
		
		//store the first character into valuable ascii
		int ascii = (int) character1;
		
		// store the second character into char by the position of string
		char character2 = str.charAt(1);
		
		//calculate the sum of first character and second character
		ascii = (int) character1 + (int)character2; 
		
		// store the third character into char by the position of string
		char character3 = str.charAt(2);
		
		//calculate the sum of first  three character
		ascii = (int) character1 + (int)character2 + (int)character3;
		
		// store the fourth character into char by the position of string
		char character4 = str.charAt(3);
		
		//calculate the sum of four character
		ascii = (int) character1 + (int)character2 + (int)character3 +(int)character4;
		
		//display the sum of ascii
		System.out.print("Sum: " + ascii);
		
	}

}

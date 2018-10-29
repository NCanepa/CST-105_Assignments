//Noah Canepa, the following code is my work
import java.util.Scanner;

public class Five_Digits {

	public static void main(String[] args) {
		//creates scanner
		Scanner input = new Scanner(System.in);
        
		//prompts user for 5 integer and stores it
		System.out.print("Enter a positive 5 digit interger");
		
		  //the following gets every individual digit
		  int amount = input.nextInt();
				
		  int firstDigit = amount /10000;
		  amount = amount % 10000;
		
		  int secondDigit = amount /1000;
          amount = amount % 1000;
		
	  	  int thirdDigit = amount /100;
	  	  amount = amount % 100;

		  int fourthDigit = amount /10;
		  amount = amount % 10;

		
		  int fifthDigit = amount;
		  
		    
		    //adds up all individual digits
			double sumOfDigits = firstDigit + secondDigit + thirdDigit + fourthDigit + fifthDigit;
		  System.out.println("All digits added together =" + sumOfDigits);	    		
				}

}

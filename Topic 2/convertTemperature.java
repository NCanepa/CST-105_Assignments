//Noah Canepa, the following code is my work

import java.util.Scanner;

public class convertTemperature {

	public static void main(String[] args) {
		//creates scanner
		Scanner input = new Scanner(System.in);
        
		//prompts and retrieves farenheit temperature from user
		System.out.print("Please enter a temperature in Farenheit ");
		
		double farenheit = input.nextDouble();
		
		  //converts farenheit to celsius
		 double celsius = (farenheit - 32) * 5.0 / 9.0;
				  
	    System.out.println(farenheit + " Farenheit is equivalent to " + celsius + " Celsius");
	    
	    //prompts and retrieves celcius temperature from user
	    System.out.print("Please enter a temperature in Celsius ");
	    
	    double secondCelsius = input.nextDouble();
		  
	      //converts celcius to farenheit
	     double secondFarenheit = secondCelsius * 9.0 / 5.0 + 32;
	     
	   System.out.println(secondCelsius + " Celsius is equivalent to " + secondFarenheit + " Farenheit");
	}

}

//Noah Canepa, this is my own code
import java.util.Scanner;

public class HigherLowerGame {
	public static void main(String[] args) {
//generates random number between 1-10000
      int number = (int) (Math.random() * 10000);
      
      Scanner input = new Scanner(System.in);
//promps for imput
      System.out.print("Please enter a guess between 0 and 10000: ");
      int guess = -1;
      int countGuess = 0;
//creates loop to allow guessing
      while (guess != number) {
//counts guesses for every loop
    	  countGuess++;
      guess = input.nextInt();
//if number is too low display this message
      if (guess < number) 
         System.out.print("HIGHER, please enter another guess between " + guess + " and 10000: ");;
//if number is too high display this message
      if (guess > number) 
    	System.out.print("LOWER, please enter another guess between 1 and " + guess + ": ");
//if correct displays it with amount of guesses
      if (guess == number)
      System.out.println("You Win, it took you " + countGuess + " guesses");
	}
  }

}
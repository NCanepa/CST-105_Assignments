//Noah Canepa, this is my work
public class primePalindrome {

	public static void main(String[] args) {
//creates the first candidate for prime palindromes
		int potentialNumber = 1;
//creates loop of up to 100000
				while (potentialNumber < 100000) {
//determines if number is bot prime and palindrome, if it is both then displays number on console
					if(prime(potentialNumber) && palindrome(potentialNumber)) {
						System.out.println(potentialNumber);
					}
					potentialNumber++;
				}
	}
//method to determine if number is a prime
private static Boolean prime(int number) {
/*checks if number is 0 or 1 if so it cant be prime, also checks if every number up to half a given number
 * is a divisor of the number, if so then it is not prime
 */
	int half = number / 2;
	if (number == 0 || number == 1) {
		return false;
	}
    for ( int i = 2; i <= half; i++ ) {
    	if ( number % i == 0) {
    		return false;
    	}
    }
    return true;
}
//method to determine if the number is a palindrome
private static Boolean palindrome(int number) {
//turns the current number into a string
    String numberString = String.valueOf(number);
//reverses the number in order to check later if it is a palindrome
    String reverseString = new StringBuffer(numberString).reverse().toString();
//checks if numberString is same as reverse if so then it is a palindrome
    if ( numberString.compareTo(reverseString) == 0 ) {
        return true;
    }
    else {
        return false;
    }
}
}
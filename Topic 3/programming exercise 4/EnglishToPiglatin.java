//Noah Canepa, this is my code
import java.io.*;
import java.util.Scanner;

public class EnglishToPiglatin {
 
private Scanner translate;
//finds the file used in the translation and displays error if one occurs
	public void openFile() {
		try {
			translate = new Scanner(new File("C:/Users/Noah C/Downloads/Translate.txt"));
		}
		catch(Exception e) {
			System.out.println("could not find file");
		}
	}
//reads every character in file until there are no more characters
	public void readFile() {
		while (translate.hasNext()) {
			String english = translate.next();
 //takes the text, converts it to piglatin, then displays both in tabular format
    String latin = pigLatin(english);
    System.out.println(english.toUpperCase() + " " + latin.toUpperCase());
  }
	}
 //does the actual converting from text to piglatin
  private static String pigLatin(String text) {
    String latin = "";
    int i = 0;
    while (i<text.length()) {
 //ignores punctuation
      while (i<text.length() && !isLetter(text.charAt(i))) {
        latin = latin + text.charAt(i);
        i++;
      }
// stops at the end of a word
      if (i>=text.length()) break;
 
      int begin = i;
      while (i<text.length() && isLetter(text.charAt(i))) {
        i++;
      } 
//translates the end of the word
      int end = i;
      latin = latin + pigWord(text.substring(begin, end));
    }
    return latin;
  }
//looks to see if a character is a letter
  private static boolean isLetter(char c) {
    return ( (c >='A' && c <='Z') || (c >='a' && c <='z') );
  }
//translate individual words to piglatin
  private static String pigWord(String word) {
    int split = firstVowel(word);
    return word.substring(split)+"-"+word.substring(0, split)+"ay";
  }
//looks for the first vowel of a word
  private static int firstVowel(String word) {
    word = word.toLowerCase();
    for (int i=0; i<word.length(); i++)
      if (word.charAt(i)=='a' || word.charAt(i)=='e' ||
          word.charAt(i)=='i' || word.charAt(i)=='o' ||
          word.charAt(i)=='u')
        return i;
    return 0;
  }
 
}

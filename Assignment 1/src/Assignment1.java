/**
 * Raul Buendia
 * 2/8/2015
 * Assignment 1 - Move the first word of a user entry and move it to the back.
 * Email:Raul.Buendia1995@gmail.com
 */
import java.util.Scanner;
public class Assignment1 {
	public static void main(String [] args) {
		
		Scanner keyboard = new Scanner(System.in);

		String sentence, text1, remaining;
		int i;
		
		System.out.println("Enter a line of text:"); //asks for input
		
		sentence = keyboard.nextLine(); // uses user input
		i = sentence.indexOf(" "); //index of " "
		text1 = sentence.substring(0,i); // grabs the first word
		remaining = sentence.substring (i + 1, sentence.length()); //takes the rest of the sentence and puts it in front of first word

		System.out.println("You entered: " + sentence); // shows what you have entered
	
		System.out.println("Let me rephrase your entry:"); 
		
		System.out.println(remaining + " " + text1); //prints out the remaining sentence with first word in the end
	}

}

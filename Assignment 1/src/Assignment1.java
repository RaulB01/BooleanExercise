import java.util.Scanner;
public class Assignment1 {
	public static void main(String [] args) {
		
		Scanner keyboard = new Scanner(System.in);

		String sentence, text1, remaining;
		int i;
		
		System.out.println("Enter a line of text:"); 
		
		sentence = keyboard.nextLine(); 
		i = sentence.indexOf(" ");
		text1 = sentence.substring(0,i);
		remaining = sentence.substring (i + 1, sentence.length());

		System.out.println("You entered: " + sentence);
	
		System.out.println("Let me rephrase your entry:");
		
		System.out.println(remaining + " " + text1);
	}

}

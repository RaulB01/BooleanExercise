import java.util.Scanner;
public class Login {
	public static void main(String[] args) {
		String Username2 = "Raul";
		String Password = "Raul123";
		
		System.out.println("Please enter your Username");
		Scanner keyboard = new Scanner(System.in);
		Username2 = keyboard.next();
		
		
		while (true){
			
		if(Username2.compareTo("Raul") == 0) {
			System.out.println("Please enter your Password");
			Scanner keyboard1 = new Scanner(System.in);
			Password = keyboard.next();
			if(Password.compareTo("Raul123") == 0) {
				System.out.println("Welcome User!");
				
			} else {
				System.out.println("Your password is incorrect");
			}
		} else {
			System.out.println("Your username is incorrect");
			System.out.println("Please enter your Username");
			Username2 = keyboard.next();
			if(Username2.compareTo("Raul") == 0) {
				//System.out.println("Please enter your Password");
				Scanner keyboard2 = new Scanner(System.in);
				Password = keyboard.next();
				if(Password.compareTo("Raul123") == 0) {
					System.out.println("Welcome User!");
		}
	}

			}
		}
	}
}

			
import java.util.Scanner;


public class ForLoop2 {
	public static void main(String[] args) {
		String user = "User";
		String pass = "User1";
		String tempuser = "";
		String temppass = "";
		Boolean buser;
		int i=0;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your username");
		tempuser = keyboard.next();
		
		for(int x=1; x<=3;x++){
			if(!tempuser.equalsIgnoreCase(user)) {
				System.out.println("Your username is incorrect");
				System.out.println("Enter your username again");
				tempuser = keyboard.next();
					}}
			for (int x=1; x<=1; x++) {
				if(!tempuser.equalsIgnoreCase(user)){
					System.out.println("Too many failed attempts, your account is now locked");
					System.out.println("Please contact your adminstrator to unlock your account!"); 
					return;
					}}
	
		System.out.println("Enter your password");
		temppass = keyboard.next();
		
		for(int x=1; x<=3;x++){
			if(!temppass.equalsIgnoreCase(pass)) {
				System.out.println("Your password is incorrect");
				System.out.println("Enter your password again");
				temppass = keyboard.next();}}
	
		for (int x=1; x<=1; x++) {
				if(!temppass.equalsIgnoreCase(pass)){
					System.out.println("Too many failed attempts, your account is now locked");
					System.out.println("Please contact your adminstrator to unlock your account!"); 
					return;

			
				}
		}	
		System.out.println("Welcome user");

}
}
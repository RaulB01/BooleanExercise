import javax.swing.JOptionPane;
public class BooleanExercise {
	public static void main (String [] args){
		String people, players;
		int groupSize, numPeople, x, y,teamSize, teamSize1 = 1,peopleSize;	

		people = JOptionPane.showInputDialog(null, "Enter the number of people:" );
		players = JOptionPane.showInputDialog(null, "Enter the number of players:" );
		x = Integer.parseInt(people);
		y = Integer.parseInt(players);
		groupSize = x+y;
		
		 if (x>10) {
			 groupSize = x/2;
			 JOptionPane.showMessageDialog(null, "The number of people is: " + people + "\n" +"The number of groups are: " + groupSize);
			 }
		 else { if (10>x && x>=3){ 
			 groupSize = x/3;
			 JOptionPane.showMessageDialog(null, "The amount of people is: " + people + "\n" +"The number of groups are: " + groupSize); 
			 		}
		   		else{
		   			JOptionPane.showMessageDialog(null, "The number entered has to be grater than or equal to 3");
		   			}	
		 }
		 
		if(11<=y && y<=55){
			teamSize = y/11;
			JOptionPane.showMessageDialog(null, "The number of players is: " + players + "\n" +"The team size is: " + teamSize);
		 }
		
		 else{
			 JOptionPane.showMessageDialog(null, "The number of players is: " + players + "\n" +"The team size is: " + teamSize1);
		 }

	}
	}
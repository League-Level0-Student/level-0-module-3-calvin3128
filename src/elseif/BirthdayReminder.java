
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String whomst = JOptionPane.showInputDialog("Who's birthday do you want?");
		// 3. Print out what the user typed
		System.out.println(whomst);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(whomst.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(whomst.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if(whomst.equalsIgnoreCase("calvin")) {
			System.out.println(myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			System.out.println("Sorry, i don't remember that person's birthday!");
		}
	} 
}

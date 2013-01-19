/**
 * 
 */

/**
 * Description
 *
 * @author Kitchiguine
 * @version Jan 19, 2013
 */

import java.util.Scanner;

public class TheoremePythagore {
	
	public static void main (String[] args){
		
		// Asking the user to type her number. This will be define as a
		Scanner sc = new Scanner (System.in);
		System.out.print ("Merci de rentrer la premiere valeur: ");
		int str = sc.nextInt();
		System.out.println("a= " + str);
		
		// Asking the user to type her number. This will be define as b
		Scanner sc1 = new Scanner (System.in);
		System.out.print ("Merci de rentrer la seconde valeur: ");
		int str1 = sc1.nextInt();
		System.out.println("b= " + str1);
	
			// Define y as the addition of a and b power 2
			double y = Math.pow(str, 2) + Math.pow(str1,2);
			
			// Define c as the square root of y
			double c = Math.sqrt(y);
			
		// Print on the screen C.	
		System.out.print ("c=: " +c);
		
	}

	

}

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
import java.math.*;

public class TheoremePythagore {
	
	public static void main (String[] args){
		
		Scanner sc = new Scanner (System.in);
		System.out.print ("Merci de rentrer la premiere valeur: ");
		int str = sc.nextInt();
		System.out.println("a= " + str);
		
		Scanner sc1 = new Scanner (System.in);
		System.out.print ("Merci de rentrer la seconde valeur: ");
		int str1 = sc1.nextInt();
		System.out.println("b= " + str1);
	
			double y = Math.pow(str, 2) + Math.pow(str1,2);
			
			double c = Math.sqrt(y);
			
			
		System.out.print ("c=: " +c);
		
	}

	

}

import java.util.Scanner;

/**
 * 
 */

/**
 * Description
 *
 * @author Kitchiguine
 * @version Jan 19, 2013
 */
public class FindRange {
	
	private static final int SENTINAL = 0;
	
	public static void main (String[] args){
	AfficherRange();
	TrouverChiffre();
	}

	/** Methode permettant de demander un chiffre
	 * 
	 */
	private static void TrouverChiffre() {

		Scanner PremierScanner = new Scanner (System.in);
		System.out.print ("Quel est votre chiffre: ");
		int FirstNumber = PremierScanner.nextInt();
		int SmallestNumber = FirstNumber;
		int LargestNumber = FirstNumber;

		
			if (FirstNumber == SENTINAL){
				// Si le nombre est �gal a la constante SENTINAL alors un message d'erreur s'affiche a l'�cran

				System.out.print ("Vous ne pouvez pas mettre 0 comme premi�re valeur. ");
			
			} else {
				
				while (FirstNumber != SENTINAL){// Tant que le chiffre est diff�rent de SENTINAL alors
					
					// Pav� de saisie d'un nouveau chiffre.
					Scanner SecondScanner = new Scanner (System.in);
					System.out.print ("Quel est votre chiffre: ");
					int SecondNumber = SecondScanner.nextInt();
						
					
						if (SecondNumber < SmallestNumber){
							if (SecondNumber != SENTINAL) {
								SmallestNumber = SecondNumber;
							} 
							
						}
						
						if (SecondNumber > LargestNumber){
							if (SecondNumber != SENTINAL) {
								LargestNumber = SecondNumber;
							} 
						
					}

					if (SecondNumber == SENTINAL){
						
						System.out.println ("Le plus elev� est: " +LargestNumber );
						System.out.println ("Le moins elev� est: " +SmallestNumber);
						FirstNumber = SENTINAL;
						
					}
					
				}	
		
			}
		}


	/**
	 * Methode permettant d'afficher l'intitul� du programme
	 */
	private static void AfficherRange() {
		System.out.println("This program finds the largest and smallest number");
		
	}
		
}

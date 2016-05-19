import java.lang.*;

/**
*De klasse TweedeProg is een Java applicatie
*@author	Joren Van Hemelrijk
*@version	1,0
*/

public class TweedeProg {

/**
*Dit is de main-functie, hier start het programma
*@param args	Dit is een array van strings waarmee parameters kunnen meegegeven worden vanaf de commandline.
*/

	public static void main(String args[]) {
	drukaf(100);
	}

/**
*Dit is de drukaf-functie, deze commentaar zal niet weergegeven worden in de documentatie omdat deze op private staat en dus niet voor een gebruiker bedoelt is.
*@param m Dit is het aantal keer dat de for-lus doorlopen zal worden.
*/
	private static void drukaf(int m) {
	int a;
	for(a=0; a<m; a++){
		System.out.println(a);
		}
	}

}
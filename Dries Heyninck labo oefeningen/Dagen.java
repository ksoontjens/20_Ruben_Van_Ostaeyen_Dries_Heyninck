public class Dagen{

	public static void main (String arg[]) {
	
	String a[]= {"Maandag", "Dinsdag", "Woensdag", "Donderdag", "Vrijdag", "Zaterdag", "Zondag"};
	
	int currentDay = 6;

	for(int b = 1; b<29; b++){
	System.out.println(a[currentDay] + " " + b + " februari");
	currentDay++;
	if(currentDay > 6) {currentDay=0;}
	}

	}

}
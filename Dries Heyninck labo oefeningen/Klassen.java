public class Klassen {

	public static void main(String args[]) {
	Werknemer jan = new Werknemer("Jan", "lalala", 1, 20);
    Werknemer luka = new Werknemer("Luka", "setq", 2, 20);
    Werknemer dries = new Werknemer("Dries", "dfsbgsf", 3, 20);
    Werknemer joren = new Werknemer("Joren", "rehzrth", 4, 20);
    PartTimeWerknemer jos = new PartTimeWerknemer("Jos", "zergrg", 5, 20,10);
    PartTimeWerknemer jef = new PartTimeWerknemer("Jef", "qdheh", 6, 20,10);
	
    jan.salarisVerhogen(10);
    luka.salarisVerhogen(10);
    jos.salarisVerhogen(10);
        
    System.out.println(jan.voornaam + " verdient " + jan.getSalaris() + " euries per uur.");
    System.out.println(luka.voornaam + " verdient " + luka.getSalaris() + " euries per uur.");    
    System.out.println(dries.voornaam + " verdient " + dries.getSalaris() + " euries per uur.");
    System.out.println(joren.voornaam + " verdient " + joren.getSalaris() + " euries per uur.");
    System.out.println(jos.voornaam + " verdient " + jos.getWeekLoon() + " euries per week.");
    System.out.println(jef.voornaam + " verdient " + jef.getWeekLoon() + " euries per week.");
    
	}

}
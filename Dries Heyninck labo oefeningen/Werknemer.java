public class Werknemer {

	public String voornaam;
	public String achternaam;
	public int werknemerNummer;
	protected float salaris;
    
    public static int aantalWerknemers;

	public void salarisVerhogen(int percentage) {
 	float verhogingsfactor = (float)percentage/100;
	salaris += salaris*verhogingsfactor;
	}

	public float getSalaris() {
	return salaris;
	}

	public Werknemer(String voornaam, String achternaam, int wNummer, float salaris) {
	this.voornaam = voornaam; //this.var => altijd dataleden
	this.achternaam = achternaam;
	werknemerNummer = wNummer;
	this.salaris = salaris;
        
    aantalWerknemers++;
	}

}
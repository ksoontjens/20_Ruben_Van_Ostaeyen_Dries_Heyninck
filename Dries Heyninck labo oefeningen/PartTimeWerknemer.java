public class PartTimeWerknemer extends Werknemer{

	public int urenGewerkt;

	public PartTimeWerknemer (String voornaam, String achternaam, int nr, float sal, int urengw) {
	super(voornaam, achternaam, nr, sal);
	urenGewerkt = urengw;
	}

	public float getWeekLoon() {
	return this.salaris * (float)this.urenGewerkt;
	}

}
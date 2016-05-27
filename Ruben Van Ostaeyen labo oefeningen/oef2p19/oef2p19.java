public class oef2p19{

  public static void main(String args[]){

    String[] days = {"Maandag", "Dinsdag", "Woensdag", "Donderdag", "Vrijdag", "Zaterdag", "Zondag"};

    for(int i = 1; i < 29; i++){
      System.out.println(days[((i + 5) % 7)] + " " + i + " frebruari 2009");
    }

  }

}

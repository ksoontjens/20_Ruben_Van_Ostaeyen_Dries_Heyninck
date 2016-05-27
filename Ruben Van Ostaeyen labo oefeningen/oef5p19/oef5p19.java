public class oef5p19{

  public static void main(String args[]){

    for(int i = 3; i<=99;i++){
      for(int y = 2 ; y <= i; y++){
        if(i == y){
          System.out.println(i + " is een priemgetal");
          break;
        }else if(i%y == 0){
          //System.out.println(i + " is geen priemgetal");
          break;
        }
      }
    }
  }

}

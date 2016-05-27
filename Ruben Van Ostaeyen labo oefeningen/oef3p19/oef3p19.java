public class oef3p19{

  public static void main(String args[]){
    double kappa=1;
    double noemerboys = 3;
    for(long i = 0; i < 10000l; i++){
      if(i%2 == 0){
        kappa -= (1/noemerboys);
      }else{
        kappa += (1/noemerboys);
      }
      noemerboys +=2;
    }
    System.out.println(kappa *= 4);
  }

}

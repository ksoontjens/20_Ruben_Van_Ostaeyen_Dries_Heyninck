public class oef7p19{
  public static void main(String args[]){
    int a[]={12,34,56,78,123,234,99,88};
    int b[]={0,0,0,0,0,0,0,0};
    int grootsteGetal = 0;
    int indexGr = -1;
    for(int x = 0; x < a.length; x++){
      for(int i = 0; i < a.length; i++){
        if(a[i] > grootsteGetal){
          grootsteGetal = a[i];
          indexGr = i;
        }
        if(i == (a.length - 1)){
          a[indexGr] = 0;
        }
      }
      b[x] = grootsteGetal;
      grootsteGetal = 0;
      //System.out.println("Het grootste element is gelijk aan " + grootsteGetal);
    }
    for(int y = 0; y < b.length; y++){
      System.out.println(b[y]);
    }
  }
}

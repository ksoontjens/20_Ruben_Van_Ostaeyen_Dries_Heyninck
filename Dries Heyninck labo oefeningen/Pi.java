public class Pi{

	public static void main (String arg[]) {

	double a = 1;
	double term = 0;

	for(int b = 0; b<10000; b++){
	if(b%2==0){term += 1/a;}	
	else {term -= 1/a;}
	a += 2;
	}
	System.out.println(4*term);
	}

}
public class GrootsteElement{

	public static void main (String arg[]) {

	int a[] = {12,34,56,78,123,234,99,88};
	int c = 0;

	for(int b = 0; b<8; b++){
	if(c < a[b]){c = a[b];}
	}
	System.out.println(c);
	}

}

public class MethodeReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  a= summe();
		System.out.println(a);
		
		int summe = a - 4;
		System.out.println(summe);
	}
	//Methode definiert
	public static int summe() {
		int a, b, summe;
		a = 5;
		b = 5;
		
		summe = a+b;
		//return holt lokale varibale aus anweisungsblock raus
		return summe;
		
	}

}

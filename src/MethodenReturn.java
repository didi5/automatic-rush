
public class MethodenReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int summe = taschenrechner(5, 5, '+');
		System.out.println(summe);
	}
	
	//lokale variablen (Sichtbarbeit von Variablen)
	public static int taschenrechner(int zahl1, int zahl2, char operator) {
		int summe; //lokale Variable
		
		if (operator== '+') {
			summe = zahl1 + zahl2;
		}else {
			summe = zahl1 + zahl2;
		}
		
		return summe;
	}

}

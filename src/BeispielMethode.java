
public class BeispielMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int gegnerLeben = 100;
		
		gegnerLeben =gegnerHit(gegnerLeben);
		System.out.println(gegnerLeben);
		
	}

	public static int gegnerHit(int aktuellLeben) {
		int neuGegnerLeben ;
		
		neuGegnerLeben = aktuellLeben -20;
		
		return neuGegnerLeben;
		
	}
}

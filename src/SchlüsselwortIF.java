
public class SchlüsselwortIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 500;
		
		if (score == 5000) {
			System.out.println("Congrats, new record!");
		}else {
			System.out.println("Not enough points...!");
		}
		
		int lebenPlayer = 0;
		
		if (lebenPlayer == 0 ) {
			System.out.println("You lost...!");
		}
		
		boolean gegenHit = true;
		int highscore = 0;
		
		if (gegenHit == true) {
			System.out.println("You hit the oppoenent");
			highscore += 10;
			System.out.println("Highscore " + highscore);
		}else {
			System.out.println("You missed...!");
		}

		System.out.println();
	}

}

import java.util.Scanner;

public class Verzweigung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Wie viele Bundesländer hat Deutschland?");
		System.out.println("15 oder 13 oder 16");
		
		
		Scanner scan 	= new Scanner(System.in);
		int eingabeUser = scan.nextInt();
		
		if (eingabeUser == 15) {
			System.out.println("That's false");
		}else if (eingabeUser == 13) {
			System.out.println("That's false");
		}else {
			System.out.println("That's true");
			System.out.println("Wie heißt der Bundespräsident?");
		}

	}

}

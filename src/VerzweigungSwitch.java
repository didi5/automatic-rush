import java.util.Scanner;

public class VerzweigungSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*switch (0) {
		case 0:
			System.out.println("Die Zahl ist eine 0");
			break;
		case 3:
			System.out.println("Die Zahl ist eine 3");
			break;
		case 5:
			System.out.println("Die Zahl ist eine 5");
			break;
		}
		*/
		
		System.out.println("Wie viele Bundesländer hat Deutschland?" + '\n' + "16 oder 3 oder 5?: ");
		
		Scanner scan 	= new Scanner(System.in);
		int eingabeUser = scan.nextInt();
		
		switch (eingabeUser) {
		case 16:
			System.out.println("True!");
			break;
		case 3:
			System.out.println("Wrong!");
			break;
		case 5:
			System.out.println("Wrong!");
			break;
		default:
			System.out.println("Number is unknown");
			break;
		}
		
	}


}

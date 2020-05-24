import java.util.Scanner;



public class Terre {

	public static void main(String[] args) {
		
		
		
		Jardin jardin = new Jardin(4, 3);
		jardin.Panier("Tomate", 3);
		jardin.Panier("Betterave", 3);
		jardin.Panier("Carotte", 3);
		jardin.Panier("Ail", 3);

		System.out.println(jardin);
		
		int action = 0;
		while(action != 4) {
			System.out.println("\nVous voulez:");
			System.out.println("\n1. Semer \n2. Récolter \n3. Saison suivante \n4. Quitter\n");
				
			Scanner sc = new Scanner(System.in);
			action = sc.nextInt();
				
			if(action == 1) {
				jardin.semer();
			}
			else if(action == 2) {
				System.out.println("\nVous avez recolté.");
			}
			else if(action == 3) {
				System.out.println("\nVous êtes passé à la saison suivante.");
			}
			else if(action == 4) {
				System.out.println(jardin);
				System.out.println("\nVous avez quittez le jardin...");
			}
			System.out.println(jardin);
		}
			
			
		
		

	}

}
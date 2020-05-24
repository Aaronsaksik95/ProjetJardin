import java.util.HashMap;
import java.util.Scanner;

import Flore.Vegetals.Ail;
import Flore.Vegetals.Betterave;
import Flore.Vegetals.Carotte;
import Flore.Vegetals.Tomate;

public class Jardin {

	private int longueur;
	private int largeur;
	private HashMap<String, Integer> panier;
	private Emplacement emplacement[][];

	public Jardin(int longueur, int largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.panier = new HashMap<String, Integer>();
		this.emplacement = new Emplacement[this.longueur][this.largeur];
	}

	public void Panier(String nom, Integer quantite) {
		this.panier.put(nom, quantite);
		
	}

	@Override
	public String toString() {

		System.out.println("Le Jardin:\n");

		for (int x = 0; x < this.longueur; x++) {
			for (int y = 0; y < this.largeur; y++) {
				Emplacement emp = emplacement[x][y];
				if (emp == null) {
					System.out.print("O");
				} else {
					System.out.print(emp);
				}
			}
			System.out.print("\n");
		}
		
		System.out.println("\nLe panier:\n");
		
		System.out.println("Ail : " + this.panier.get("Ail") + " graines.");
		System.out.println("Betterave : " + this.panier.get("Betterave") + " graines.");
		System.out.println("Carotte : " + this.panier.get("Carotte") + " graines.");
		System.out.println("Tomate : " + this.panier.get("Tomate") + " graines.");
		
		return "";

	}

	public void semer() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Choisissez la ligne de 0 à " + (longueur-1));
		int x = scanner.nextInt();

		System.out.println("Choisissez la colonne de 0 à " + (largeur-1));
		int y = scanner.nextInt();

		System.out.println("Végétals à planter: \n1. Ail \n2. Betterave \n3. Carotte \n4. Tomate\n");
		int vegetalSemer = scanner.nextInt();

		if (vegetalSemer == 1) {
			if (this.panier.get("Ail") > 0) {
				this.emplacement[x][y] = new Emplacement(new Ail());
				int quantAil = this.panier.get("Ail") - 1;
				this.panier.put("Ail", quantAil);
			}
			else {
				System.out.println("Vous n'avez plus d'ail dans votre panier.\n");
				semer();
			}
		}
		else if (vegetalSemer == 2) {
			if (this.panier.get("Betterave") > 0) {
				this.emplacement[x][y] = new Emplacement(new Betterave());
				int quantBet = this.panier.get("Betterave") - 1;
				this.panier.put("Betterave", quantBet);
			}
			else {
				System.out.println("Vous n'avez plus de betterave dans votre panier.\n");
				semer();
			}
		}
		else if (vegetalSemer == 3) {
			if (this.panier.get("Carotte") > 0) {
				this.emplacement[x][y] = new Emplacement(new Carotte());
				int quantCar = this.panier.get("Carotte") - 1;
				this.panier.put("Carotte", quantCar);
			}
			else {
				System.out.println("Vous n'avez plus de carotte dans votre panier.\n");
				semer();
			}
		}
		else if (vegetalSemer == 4) {
			if (this.panier.get("Tomate") > 0) {
				this.emplacement[x][y] = new Emplacement(new Tomate());
				int quantTom = this.panier.get("Tomate") - 1;
				this.panier.put("Tomtate", quantTom);
			}
			else {
				System.out.println("Vous n'avez plus de tomate dans votre panier.\n");
				semer();
			}
		}
	}

}
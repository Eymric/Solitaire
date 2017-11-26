package javasolitaire;

import java.util.ArrayList;
import java.util.Scanner;

public class Pioche{

	public ArrayList<Carte> pioche = new ArrayList<Carte>();
	Jeu j = new Jeu();
	
	public Pioche(ArrayList<Carte> paq ) {
//		System.out.println(" Pioche: ");
		for (int i = 0; i < 24; i++) {
			pioche.add(paq.get(0));
			paq.remove(0);
			pioche.get(i).setEtat();
//			System.out.println(pioche.get(i));
		}	
	}
	
	public void changerCarte() {
		Carte stock;
		stock = pioche.get(0);
		pioche.remove(0);
		pioche.add(stock);
	}
}
	
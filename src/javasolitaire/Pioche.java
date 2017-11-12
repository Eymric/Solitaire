package javasolitaire;

import java.util.ArrayList;

public class Pioche {

	public Pioche() {
		
	}
	public ArrayList<Carte> pioche = new ArrayList<Carte>();
	public ArrayList<Carte> paq = new ArrayList<Carte>();
	Colonnes c = new Colonnes();
	public void ajout() {
		
		
//		c.afficherColonne();
		c.ajoutcarte();
	}
	
	public void pioche() {
		ajout();
		System.out.println(" Pioche: ");
		c.ColonnesAutomatise();
		int indicetab = 28;
		for (int i = 0; i<=23; i++) {
			pioche.add(c.paq.get(indicetab));
//			pioche.get(i).setEtat();
			System.out.println(pioche.get(i));
			indicetab++;
		}
	}
}
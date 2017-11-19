package javasolitaire;

import java.util.ArrayList;
import java.util.Scanner;

public class Pioche{

	public ArrayList<Carte> pioche = new ArrayList<Carte>();
	Jeu j = new Jeu();
	
	public Pioche(ArrayList<Carte> paq ) {
		System.out.println(" Pioche: ");
		for (int i = 0; i < 24; i++) {
			pioche.add(paq.get(0));
			paq.remove(0);
			pioche.get(i).setEtat();
			System.out.println(pioche.get(i));
		}	
		
	}
	
	public void changerCarte() {
		Carte stock;
		stock = pioche.get(0);
		pioche.remove(0);
		pioche.add(stock);
	}
	
	public void deplacementPiochee(int nb) {
		if (j.verrifCarte(j.p.get(nb-1).get(j.p.get(nb-1).size()-1), pioche.get(0))) {
			j.p.get(nb-1).add(pioche.get(0));
			pioche.remove(0);}
		else {
			System.out.println("Deplacement impossible");
		}
	}
	
	public void deplacementPioche() {
		System.out.println("Carte: "+ pioche.get(0)+" Dans quel tas voulez vous deplacer cette carte, Tapez 0 si vous ne voulez pas cette carte.");
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();
		switch (choix)
		{
		  case 1:
			deplacementPiochee(1);
		    break;        
		  case 2:
			deplacementPiochee(2);
			break; 
		  case 3:
			deplacementPiochee(3);
			break; 
		  case 4:
			deplacementPiochee(4);
			break; 
		  case 5:
			deplacementPiochee(5);
			break;
		  case 6:
			deplacementPiochee(6);
			break;		
		  case 7:
			deplacementPiochee(7);
			break;
		  case 0:
			changerCarte();
			deplacementPioche();
		  default:
		    System.out.println("Veuillez reessayez");           
		}
	}
	
}
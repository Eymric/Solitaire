package javasolitaire;

import java.util.ArrayList;
import java.util.Collections;

public class Carte {

	private int type, cartenb;
	private String[] cartetype = {"Trefle", "Pique", "Carreau", "Coeur"};	
	private int[] nbcarte = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private boolean couleur;
	private boolean etat=false;
	
	
	public Carte() {
		};
	
	public Carte(int types, int cartenb)
	{
		type = types; 
		this.cartenb = cartenb;
		if (type <= 1)
			couleur = true;
		else 
			couleur = false;
	}
	
	public void setCouleur(boolean couleur) {
		this.couleur = couleur;
	}

	public String[] getCartetype() {
		return cartetype;
	}

	public int[] getNbcarte() {
		return nbcarte;
	}

	public void setEtat() {
		etat = true;
	}


	public int getType() {
		return type;
	}

	public int getCartenb() {
		return cartenb;
	}

//	public void afficherPaquet() {
//
//		for(int i=0; i<cartee.size(); i++)
//		{
//			System.out.println(cartee.get(i));
//		}
//	}
//	
//	public void melangerPaquet() {
//		Collections.shuffle(cartee);
//		
//	}
//	
//		public void afficherCarte(int nb) {
//			System.out.println(cartee.get(nb));
//		}
//
//		public void afficherType(int nb) {
//			System.out.println(getCartetype()[nb]);
//		}
//		
//		public void afficherCouleur(int nb) {
//			System.out.println(cartee.get(nb).couleur); 
//		}
//		
//		public boolean getCouleur() {
//			return couleur;
//		}
//		
//		public void af() {
//			System.out.println(cartee);
//		}



	public String toString()
	{
		if (getEtat() == true) {
		String cartefinal = getNbcarte()[getCartenb()] + " de " + getCartetype()[getType()];
		return cartefinal;  
		}
		else
		{
		String cartefinal = " Carte cache";
		return cartefinal;  
		}
	}

	public boolean getEtat() {
		// TODO Auto-generated method stub
		return etat;
	}
}


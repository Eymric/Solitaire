package javasolitaire;

import java.util.ArrayList;
import java.util.Collections;

public class Carte {

	private int type, cartenb;
	private String[] cartetype = {"Trefle", "Pique", "Carreau", "Coeur"};	
	private int[] nbcarte = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
	private boolean couleur;
	private boolean etat = false;
	
	
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
	
	public String[] getCartetype() {
		return cartetype;
	}

	public int[] getNbcarte() {
		return nbcarte;
	}


	public ArrayList<Carte> cartee = new ArrayList<Carte>();
		

	public void ajoutcarte()
	{

		for(int type =0; type<=3; type++)
		{
			for(int cartenb =0; cartenb<=12;cartenb++)
			{
				cartee.add(new Carte(type,cartenb));
			}
		}
	}

	public int getType() {
		return type;
	}

	public int getCartenb() {
		return cartenb;
	}

	public void afficherPaquet() {

		for(int i=0; i<cartee.size(); i++)
		{
			System.out.println(cartee.get(i));
		}
	}
	
	public void melangerPaquet() {
		Collections.shuffle(cartee);
		
	}
	
		public void afficherCarte(int nb) {
			System.out.println(cartee.get(nb));
		}

		public void afficherType(int nb) {
			System.out.println(getCartetype()[nb]);
		}
		
		public void afficherCouleur(int nb) {
			System.out.println(cartee.get(nb).couleur); 
		}
		
		public boolean getCouleur() {
			return couleur;
		}
		
		public void af() {
			System.out.println(cartee);
		}
		
	public ArrayList<Carte> getCartee() {
			return cartee;
		}


	public String toString()
	{
		String cartefinal = getNbcarte()[cartenb] + " de " + getCartetype()[type];

		return cartefinal;  
	}
}



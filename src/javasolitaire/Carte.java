package javasolitaire;

import java.util.ArrayList;
import java.util.Collections;

public class Carte {

	private int type, cartenb;
	private static String[] cartetype = {"Trefle", "Pique", "Carreau", "Coeur"};	
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

	public int getCartenb() {
		return cartenb;
	}
	
	public void setEtat() {
		etat = true;
	}
	
		public boolean getCouleur() {
			return couleur;
		}

	public String toString()
	{
		if (getEtat() == true) {
		String cartefinal = nbcarte[cartenb] + " de " + cartetype[type];
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


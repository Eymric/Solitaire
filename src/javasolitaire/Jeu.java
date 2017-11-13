package javasolitaire;
import java.util.*;

public class Jeu{
	
	public Jeu() {
		
	}
	
	Carte a = new Carte();
	public ArrayList<Carte> p1 = new ArrayList<Carte>();
	public ArrayList<Carte> p2 = new ArrayList<Carte>();
	public ArrayList<Carte> p3 = new ArrayList<Carte>();
	public ArrayList<Carte> p4 = new ArrayList<Carte>();
	public ArrayList<Carte> p5 = new ArrayList<Carte>();
	public ArrayList<Carte> p6 = new ArrayList<Carte>();
	public ArrayList<Carte> p7 = new ArrayList<Carte>();
	public ArrayList<Carte> pioche = new ArrayList<Carte>();
	public ArrayList<Carte> paq = paquet();
	public ArrayList<Carte> paquet()
	{
		ArrayList<Carte> paq = new ArrayList<Carte>();
		
		for(int type =0; type<=3; type++)
		{
			for(int cartenb =0; cartenb<=12;cartenb++)
			{
				paq.add(new Carte(type,cartenb));
			}
		}
		return paq;
	}
	
	public void premiereColonne() {
		System.out.println("Premiere colonne :");
	for (int i= 0; i<=6; i++) {
		p1.add(paq.get(i));
		if ( i == 6)
			p1.get(i).setEtat();
		System.out.println(p1.get(i));
		}
	}
	
	public void deuxiemeColonne() {
		int indicetab = 7;
		System.out.println("Deuxieme colonne: ");
		for (int i = 0; i<=5; i++) {
			p2.add(paq.get(indicetab));
			if ( i == 5)
				p2.get(i).setEtat();
			System.out.println(p2.get(i));
			indicetab++;
		}
	}

	public void troisiemeColonne() {
		int indicetab = 13;
		System.out.println("Troisieme colonne: ");
		for (int i = 0; i<=4;i++) { 
			p3.add(paq.get(indicetab));
			if (i == 4) 
				p3.get(i).setEtat();
		System.out.println(p3.get(i));
			indicetab++;
		}
	}
	
	public void quatriemeColonne() {
		int indicetab = 18;
		System.out.println("Quatrieme colonne: ");
		for (int i = 0; i<=3; i++) {
			p4.add(paq.get(indicetab));
			if (i == 3)
				p4.get(i).setEtat();
			System.out.println(p4.get(i));
			indicetab++;
			}
		}
	
	public void cinquiemeColonne() {
		int indicetab = 22;
		System.out.println("Cinquieme colonne: ");
		for (int i = 0; i<=2; i++) {
			p5.add(paq.get(indicetab));
			if (i == 2)
				p5.get(i).setEtat();
			System.out.println(p5.get(i));
			indicetab++;
		}
	}
	
	public void sixiemeColonne() {
		System.out.println(" Sixieme colonne: ");
		int indicetab = 25;
		for (int i = 0; i<=1; i++) {
			p6.add(paq.get(indicetab));
		if (i == 1)
			p6.get(i).setEtat();
			System.out.println(p6.get(i));
			indicetab++;
		}
	}
	
	public void septiemeColonne() {
		System.out.println("Septieme colonne: ");
			p7.add(paq.get(27));
			p7.get(0).setEtat();
			System.out.println(p7.get(0));
	}

	public void initialisationTerrain() {
		paquet();
		melangerPaquet();
		premiereColonne();
		deuxiemeColonne();
		troisiemeColonne();
		quatriemeColonne();
		cinquiemeColonne();
		sixiemeColonne();
		septiemeColonne();
		pioche();
	}
	
	public void pioche() {
		
		System.out.println(" Pioche: ");
		int indicetab = 28;
		for (int i = 0; i<=23; i++) {
			pioche.add(paq.get(indicetab));
			pioche.get(i).setEtat();
			System.out.println(pioche.get(i));
			indicetab++;
		}
	}
	
	
	public boolean getEtat () {
		return a.getEtat();
	}
	
//	public void afficherCarte(int nb) {
//		System.out.println(paq.get(nb));
//	}
//	
//	public void afficherEtat(int nb) {
//		System.out.println(paq.get(nb));
//	}
//	
	public void melangerPaquet() {
		Collections.shuffle(paq);
		}

	
//	public void afficherColonnes() {
//		for(int i=0; i<p1.size(); i++)
//		{
//			System.out.println(a.getCartee().get(i));
//		}
//		for (int i=0; i<p2.size(); i++)
//		{
//			System.out.println(a.getCartee().get(i)));
//		}
//	}
	
}

package javasolitaire;
import java.util.*;

public class Colonnes{
	
	public Colonnes() {
		
	}
	Carte a = new Carte();
	public ArrayList<Carte> p1 = new ArrayList<Carte>();
	public ArrayList<Carte> p2 = new ArrayList<Carte>();
	public ArrayList<Carte> p3 = new ArrayList<Carte>();
	public ArrayList<Carte> p4 = new ArrayList<Carte>();
	public ArrayList<Carte> p5 = new ArrayList<Carte>();
	public ArrayList<Carte> p6 = new ArrayList<Carte>();
	public ArrayList<Carte> p7 = new ArrayList<Carte>();
	public ArrayList<Carte> paq = new ArrayList<Carte>();
	
	public void ajoutcarte()
	{

		for(int type =0; type<=3; type++)
		{
			for(int cartenb =0; cartenb<=12;cartenb++)
			{
				paq.add(new Carte(type,cartenb));
			}
		}
	}
	
	public void premiereColonne() {
		System.out.println("Premiere colonne :");
	for (int i= 0; i<=6; i++) {
		p1.add(paq.get(i));
		System.out.println(p1.get(i));
	}
	}

	public void melangerPaquet() {
		Collections.shuffle(paq);
		
	}
	public void deuxiemeColonne() {
		System.out.println("Deuxieme colonne: ");
		for (int i = 7; i<=12; i++) {
			p2.add(paq.get(i));
		}
		for (int i = 0; i<=5;i++)
		{
			System.out.println(p1.get(i));
		}
	}
	
	public void troisiemeColonne() {
		System.out.println("Troisieme colonne: ");
		for (int i = 13; i<=17;i++) 
			p3.add(paq.get(i));
			for (int i=0;i<=4;i++)
		System.out.println(p3.get(i));
		
	}
	
	public void quatriemeColonne() {
		System.out.println("Quatrieme colonne: ");
		for (int i = 18; i<=21; i++) 
			p4.add(paq.get(i));
			for (int i=0;i<=3;i++)
			System.out.println(p4.get(i));
		}
	
	public void cinquiemeColonne() {
		System.out.println("Cinquieme colonne: ");
		for (int i = 22; i<=24; i++) 
			p5.add(paq.get(i));
			for (int i= 0;i<=2;i++)
			System.out.println(p5.get(i));
		
	}
	
	public void sixiemeColonne() {
		System.out.println(" Sixieme colonne: ");
		for (int i = 25; i<=26; i++) 
			p6.add(paq.get(i));
		for (int i=0;i<=1;i++ )
			System.out.println(p6.get(i));
		}
	
	public void septiemeColonne() {
		System.out.println("Septieme colonne: ");
			p7.add(paq.get(27));
			System.out.println(p7.get(0));
	}
	
	public void ColonnesAutomatise() {
		premiereColonne();
		deuxiemeColonne();
		troisiemeColonne();
		quatriemeColonne();
		cinquiemeColonne();
		sixiemeColonne();
		septiemeColonne();
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
	
	public void af() {
		System.out.println(paq);
	}
	
	public String toString()
	{
		String cartefinal = a.getNbcarte()[a.getCartenb()] + " de " + a.getCartetype()[a.getType()];

		return cartefinal;  
	}
	
	
	
	
	
	}
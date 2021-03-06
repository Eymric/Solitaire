package javasolitaire;
import java.util.*;

public class Jeu{

	Carte a = new Carte();
	public ArrayList<ArrayList<Carte>> t = new ArrayList<ArrayList<Carte>>();
	public ArrayList<ArrayList<Carte>> p = new ArrayList<ArrayList<Carte>>();
	public ArrayList<Carte> paq = paquet();
	private Pioche pioche;
	
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
	
	public void colonnes() {
		for (int i=0;i<=6; i++)
			p.add(new ArrayList<Carte>());
	}
	
	public void piles() {
		for (int i=0; i<=3; i++)
			t.add(new ArrayList<Carte>());
	}
	
	public boolean verrifPile(Carte a) {
		for (int i=0;i<t.size();i++) {
			if (t.get(i).isEmpty() && a.getType() == i && a.getCartenb() == 0) {
				t.get(i).add(a);
				return true;
				}
			else {
//				Carte cartePile = t.get(i).get(t.get(i).size()-1);
				if (a.getType() == i && !t.get(i).isEmpty() && a.getCartenb() - t.get(i).get(t.get(i).size()-1).getCartenb() == 1) {
				t.get(i).add(a);
				return true;
				}
			}
			}
		return false;
	}

	public boolean finDuJeu() {
		for (int i=0, x=0; i<7; i++) {
			if (p.get(i).isEmpty()) 
				x++;
		if (x == 6) 
			System.out.println("Felicitation, vous avez gagn�");
		return true;
		}
		return false;
	}
	
	public void demandeUser() {
		if (finDuJeu())
			System.out.println("Quel action desirez vous faire?\n1: Piocher une carte\n2: Deplacer une carte");
			Scanner sc = new Scanner(System.in);
			int choix = sc.nextInt();
			if (choix == 1) {
				if (pioche.pioche.isEmpty()) {
					System.out.println("Pioche vide");
				demandeUser();
				}
				else
					deplacementPioche();
			}
				
			if (choix == 2) 
				demandeDeplacement();		
	}
	
	public void retournerCarte(ArrayList<ArrayList<Carte>> p, int recup) {
		if (!p.get(recup-1).isEmpty()) {
			Carte carte = p.get(recup-1).get(p.get(recup-1).size()-1);
			if (carte.getEtat() == false) {
				carte.setEtat();
			}	
		}
	}
	
	public void deplacementCartes(int s, int recup, int placer) {
		Carte carteRecup = p.get(recup-1).get(p.get(recup-1).size()-s);
		if (!p.get(placer-1).isEmpty()) {
			Carte cartePlacer = p.get(placer-1).get(p.get(placer-1).size()-1);
			if (verrifCarte(cartePlacer, carteRecup)) {
				int x = s;
				for (int i=0; i<s ;i++, x--) {
					p.get(placer-1).add(p.get(recup-1).get(p.get(recup-1).size()-x));
					p.get(recup-1).remove(p.get(recup-1).size()-x);	
				}	
					retournerCarte(p, recup);
			}
			else 
				System.out.println("Deplacement impossible");
		} else {
			int x = s;
			for (int i=0; i<s ;i++, x--) {
				p.get(placer-1).add(p.get(recup-1).get(p.get(recup-1).size()-x));
				p.get(recup-1).remove(p.get(recup-1).size()-x);	
			}
			retournerCarte(p, recup);
		}
	}
	public void demande1Carte(int recup) {
		System.out.println("Dans quelle colonne voulez vous placer la carte");
		Scanner sc2 = new Scanner(System.in);
		int placer = sc2.nextInt();
		deplacement(placer, recup);
		affichaj();
		demandeUser();
	}

	public void demandeDeplacement() {
		System.out.println("Dans quelle colonne se situe la carte à prendre");
		Scanner sc = new Scanner(System.in);
		int recup = sc.nextInt();
		Carte carteRecup = p.get(recup-1).get(p.get(recup-1).size()-1);
		if (verrifPile(carteRecup)) {
			System.out.println("Ajout automatique de la carte vers la pile de son type.");
			p.get(recup-1).remove(p.get(recup-1).size()-1);
			retournerCarte(p, recup);
			affichaj();
			demandeUser();
		}
		 if (carteRecup == p.get(recup-1).get(0) ) 
			 
			demande1Carte(recup);
		 
		else if (!p.get(recup-1).get(p.get(recup-1).size()-2).getEtat()) 
			
			demande1Carte(recup);
			
		else {
		System.out.println("En partant de la droite, combien de cartes souhaitez vous selectionner?");
		Scanner sc1 = new Scanner(System.in);
		int selection = sc1.nextInt();
		if (selection == 1) {
			System.out.println("Dans quelle colonne voulez vous placer la carte");
			Scanner sc2 = new Scanner(System.in);
			int placer = sc2.nextInt();
			deplacement(placer, recup);
			affichaj();
			demandeUser();
		}
		else if (selection > 1 ) {
			System.out.println("Dans quelle colonne voulez vous placer les cartes");
			Scanner sc2 = new Scanner(System.in);
			int placer = sc2.nextInt();
			deplacementCartes(selection, recup, placer);
			affichaj();
			demandeUser();
			}
		}
	}

		
		public void deplacement(int placer, int recup) {
			Carte carteRecup = p.get(recup-1).get(p.get(recup-1).size()-1);
			if (!p.get(placer-1).isEmpty()) {
				Carte cartePlacer = p.get(placer-1).get(p.get(placer-1).size()-1);
				if (verrifCarte( cartePlacer, carteRecup)) {
					p.get(placer-1).add(carteRecup);
					p.get(recup-1).remove(p.get(recup-1).size()-1);
					retournerCarte(p, recup);
					}
				else 
					System.out.println("Deplacement impossible");
			}
			else {
				p.get(placer-1).add(carteRecup);
				p.get(recup-1).remove(p.get(recup-1).size()-1);
				retournerCarte(p,recup);
			}
		}
		
	
	public void deplacementPiochee(int nb) {
		Carte cartePioche = pioche.pioche.get(0);
		if (!p.get(nb-1).isEmpty()) {
			Carte derniereCarte = p.get(nb-1).get(p.get(nb-1).size()-1);
			if (verrifCarte(derniereCarte , cartePioche)) {
				p.get(nb-1).add(cartePioche);
				pioche.pioche.remove(0);
			}
			else 
				System.out.println("Deplacement impossible");
		}
		else {
			p.get(nb-1).add(cartePioche);
			pioche.pioche.remove(0);
		}
	}
		
		
	
	public void deplacementPioche() {
		Carte cartePioche = pioche.pioche.get(0);
		System.out.println("Carte: "+ cartePioche +" Dans quel tas voulez vous deplacer cette carte, Tapez 0 si vous ne voulez pas cette carte. Tapez 8 pour inserer la carte dans la pile de son type.");
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();
		if (choix > 0 && choix <=7) {
			deplacementPiochee(choix);
			affichaj();
			demandeUser();
		}
		else if (choix == 0) {
			pioche.changerCarte();
			deplacementPioche();
		}
		else if (choix == 8)
			if (verrifPile (cartePioche)) {
				System.out.println("Ajout automatique de la carte dans la pile de son type");
				pioche.pioche.remove(0);
				affichaj();
				demandeUser();
			}
	}
	
	public void ajout() {
		for(int i=0;i<p.size();i++)
		{	
			for(int j=0;j<=i;j++)
			{
				
				if(j == i) 
					paq.get(0).setEtat();
				p.get(i).add(paq.get(0));
				paq.remove(0);
			}	
		}	
	}
	
	public void setEtat() {
		a.setEtat();
	}
	
	public void affichaj() {
		for (int i = 0; i<=3; i++)
			System.out.println("Pile "+ (i+1)+ ":  "+ t.get(i));
		for(int i = 0 ; i <=6; i++) 
			System.out.println("Colonne "+ (i+1) + ":   " + p.get(i));
	}
//	
	public void initialisationTerrain() {
		paquet();
		melangerPaquet();
		colonnes();
		piles();
		ajout();
		affichaj();
		pioche();
		demandeUser();
	}
	
	public void pioche() {
		this.pioche = new Pioche(paq);
	}
	
	public void melangerPaquet() {
		Collections.shuffle(paq);
		}

	public boolean verrifCarte(Carte a, Carte b) {
		if ( a.getCouleur() != b.getCouleur() && a.getCartenb() - b.getCartenb() == 1 )
			return true;
		else 
			return false;
	}
	
	public int getCartenb() {
		return a.getCartenb();
	}
	
}

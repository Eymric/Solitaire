package javasolitaire;
import java.util.*;

public class Jeu{

	Carte a = new Carte();
	public ArrayList<Carte> t = new ArrayList<Carte>();
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
	
	public void demandeUser() {
		System.out.println("Quel action desirez vous faire?\n1: Piocher une carte\n2: Deplacer une carte");
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();
		if (choix == 1) 
			pioche.deplacementPioche();
		if (choix == 2) {
			demandeDeplacement();
			
		}
	}

	
	public void demandeDeplacement() {
		System.out.println("Dans quel tas de carte se situe la carte à prendre");
		Scanner sc = new Scanner(System.in);
		int recup = sc.nextInt();
		System.out.println("Dans quel tas de carte placer la carte ");
		Scanner sc2 = new Scanner(System.in);
		int placer = sc2.nextInt();
		deplacement(placer, recup);
	}
	
//		public void deplacementPioche(int nb) {
//			if (verrifCarte(p.get(nb-1).get(p.get(nb-1).size()-1), pioche.pioche.get(0))) {
//				p.get(nb-1).add(pioche.pioche.get(0));
//				pioche.pioche.remove(0);}
//			else {
//				System.out.println("Deplacement impossible");
//			}
//		}
		
		public void deplacement(int placer, int recup) {
			if (verrifCarte(p.get(placer-1).get(p.get(placer-1).size()-1), p.get(recup-1).get(p.get(recup-1).size()-1))) {
				p.get(placer-1).add(p.get(recup-1).get(p.get(recup-1).size()-1));
				p.get(recup-1).remove(p.get(recup-1).size()-1);
				p.get(recup-1).get(p.get(recup-1).size()-1).setEtat();
				}
			else 
				System.out.println("Deplacement impossible");
		}
	
		
			public void b() {
			p.get(1).add(pioche.pioche.get(0));
			System.out.println(p.get(1));
			}

	public void a() {
		System.out.println(p.get(1).get(p.get(1).size()-1));
		System.out.println(pioche.pioche.get(0));
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
		for(int i = 0 ; i <=6; i++) {
			System.out.println(p.get(i));
		}
	}

	public void initialisationTerrain() {
		paquet();
		melangerPaquet();
		colonnes();
		ajout();
		affichaj();
		pioche();
		demandeUser();
		affichaj();
	}
	
	public void pioche() {
		this.pioche = new Pioche(paq);
	}
	
	public boolean getEtat () {
		return a.getEtat();
	}
	
	public boolean getCouleur () {
		return a.getCouleur();
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

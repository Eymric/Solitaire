package javasolitaire;


public class CarteTest  {

	public static void main(String[] args)
	{    
		
//		a.ajoutcarte();
//		// a.afficherPaquet();
//		a.afficherCarte(10);
//		//a.melangerPaquet();
//		a.afficherCarte(10);
//		a.afficherType(3);
//		System.out.println(a.getCouleur());
		Colonnes c = new Colonnes();
	
//		c.afficherColonne();
		c.ajoutcarte();
		c.melangerPaquet();
		c.ColonnesAutomatise();
		Pioche p = new Pioche();
		p.pioche();
		c.pioche();
		
		
		
	}
}



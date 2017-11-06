package javasolitaire;
import java.util.ArrayList;

public class CarteTest extends ArrayList{
	
		public ArrayList<Test> cartee = new ArrayList<Test>(); 

	    public void ajoutcarte()
	    {
	    	
        for(int type =0; type<=3; type++)
        {
            for(int cartenb =0; cartenb<=12;cartenb++)
            {
                cartee.add(new Test(type,cartenb));
            }
        }
	    }
        
        public void afficherCarte() {

	    	  for(int i=0; i<cartee.size(); i++)
	    	    {
	    	        System.out.println(cartee.get(i));
	    	    }
	    	  
        }
        
	    public static void main(String[] args)
	    {    
	    	CarteTest a = new CarteTest();
	    	a.ajoutcarte();
	    	a.afficherCarte();
	    	System.out.println();
	    }
}


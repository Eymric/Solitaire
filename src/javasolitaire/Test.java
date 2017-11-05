package javasolitaire;

public class Test {
		
	 private int type, cartenb;
	    private String[] cartetype = {"Trefle", "Pique", "Carreau", "Coeur"};	
	    private String[] nbcarte = {"As", "Roi", "Dame", "Valet", "10",
	                                   "9", "8", "7", "6", "5", "4", "3", "2"};

	    public Test(int types, int cartenb)
	    {
	        type = types; 
	        this.cartenb = cartenb;
	    }

	    public String toString()
	    {
	        String cartefinal = nbcarte[cartenb] + " de " + cartetype[type];

	        return cartefinal;
	    }
	}

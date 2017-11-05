package javasolitaire;
import java.util.ArrayList;

public class CarteTest {
	
		private static ArrayList<Test> cartee = new ArrayList<>();

	    public CarteTest()
	    {
	        cartee = new ArrayList<Test>();

	        for(int type =0; type<=3; type++)
	        {
	            for(int cartenb =0; cartenb<=12;cartenb++)
	            {
	                cartee.add(new Test(type,cartenb));
	            }
	        }  
	    }
	    public static void main(String[] args)
	    {    
	        if (cartee == null) {
	            System.out.println("Hehooooo !");
	            return;
	        }
	    	  for(int i=0; i<CarteTest.cartee.size(); i++)
	    	    {
	    	        System.out.println(CarteTest.cartee.get(i).toString());
	    	    }
}
}
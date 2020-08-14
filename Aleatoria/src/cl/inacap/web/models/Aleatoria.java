package cl.inacap.web.models;

import java.util.Random;

public class Aleatoria {
	
		    
		public static String aleatorio(){
		    
	        Random random = new Random();
	        String caract= "abcdefg123456789";
	        String alphanum = "";
	        for (int i=0; i<=14 ; i++) {
	        int num= random.nextInt(caract.length());
	        alphanum= alphanum + caract.charAt(num);
	        
	       
	        
	        }
	        return alphanum;
	        
		}
	    
}

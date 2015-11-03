package FUNCTIONS;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class functions {
        public boolean isNumeroRegexp(String texto) {  
        Pattern pat = Pattern.compile("[0-9]+");        
        Matcher mat = pat.matcher(texto);  
        return mat.matches();  
    }
    
}
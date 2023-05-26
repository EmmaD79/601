package mayordeedad;

import java.util.Scanner;

/**
 *
 * @author Emmita
 */
public class MAYORDEEDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println ("Dame la edad: ");
        byte edad = entrada.nextByte();
        
        System.out.println (regresaMayorEdad(edad));
        
    }
    
    public static String regresaMayorEdad (byte num){
        
        if ( num>=18){
            
            return "Mayor de edad";
        }else {
            
            return "Menor de edad";
        }
    }
}
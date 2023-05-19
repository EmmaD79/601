package pkg3.v2trifiv;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Emmita
 */
public class V2TRIFIV {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        //Declaracion de variables 
        BufferedReader bufEntrada=new BufferedReader(new InputStreamReader(System.in));
        int num;
        int mult3;
        int mult5;
        
        //Entrada de datos 
            System.out.println("Dame el número");
            num=Integer.parseInt(bufEntrada.readLine());
        
        //Procesar datos 
            mult3= num%3;
            mult5= num%5;
        
        //Salida de datos
        if( mult3 == 0 && mult5 == 0){
            System.out.println("TRIFIV");
        } else if (mult3 == 0){
            System.out.println("TRU");
        } else if (mult5 == 0){
            System.out.println("FIV");
        }
    }
}

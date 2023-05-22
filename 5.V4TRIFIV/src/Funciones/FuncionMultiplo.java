package Funciones;


public class FuncionMultiplo {
    
    public String returnaMultiplo(int num){
        int mult3;
        int mult5;
        
        //Procesar datos
                
        mult3 = num % 3;
        mult5 = num % 5;
        
        //Salida de datos
                
                if(mult3 == 0 && mult5 == 0){
                    return("TRIFIV");
                    
                } else if(mult3 == 0){
                    return("TRI");
                    
                }else if(mult5 == 0){
                    return("FIV");
                }
                return "Ningun valor";
    }
}

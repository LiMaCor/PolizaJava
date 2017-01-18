package polizajava;

import Modelo.*;
import java.util.Scanner;

/**
 *
 * @author PixelZer0
 */
public class PolizaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variables
        
        Scanner sc = new Scanner(System.in);
        
        Persona manuel = new Persona("Manuel", "C/ Eduard Boscà", "19472571P",37);
        CompañiaDeSeguros slucia = new CompañiaDeSeguros("Santalucia", 43005);
        PolizaDeSeguros tipo_3 = new PolizaDeSeguros(37, "Póliza de tipo 3");
        
        ContratoDeSeguros hogar = new ContratoDeSeguros(50, "24/05/2008", 
                                manuel, tipo_3, slucia);
        
        System.out.print(hogar.toString());
        
    }
    
}
package Modelo;

/**
 *
 * @author PixelZer0
 */
public class CompañiaDeSeguros {
    
    // Variables
    
    private String nombre;
    private int id;
    
    /**
     * Método constructor
     * @param n - Representa el nombre de la compañía
     * @param i - Representa el id de la compañía
     */
    
    public CompañiaDeSeguros(String n, int i) {
        this.nombre = n;
        this.id = i;
    }
    
    /**
     * Constructor por defecto
     */
    
    public CompañiaDeSeguros() {
    }
  
}
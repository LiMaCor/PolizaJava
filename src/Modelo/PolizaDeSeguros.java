package Modelo;

/**
 *
 * @author PixelZer0
 */
public class PolizaDeSeguros {
    
    // Variables
    
    private String tipoPoliza;
    private int id;
    
    /**
     * Método constructor
     * @param i - Representa el id de la póliza
     * @param t - Representa el tipo de la póliza
     */
    
    public PolizaDeSeguros(int i, String t) {
        this.id = i;
        this.tipoPoliza = t;
    }
    
    /**
     * Constructor por defecto
     */
    
    public PolizaDeSeguros() {
    }
    
}
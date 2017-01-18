package Modelo;

/**
 *
 * @author PixelZer0
 */
public class ContratoDeSeguros {
    
    // Variables
    
    private int id;
    private String fechaFirma;
    private Persona persona;
    private PolizaDeSeguros poliza;
    private CompañiaDeSeguros compañia;
    
    /**
     * Método constructor
     * @param i - Representa el id del contrato
     * @param f - Representa la fecha de firma del contrato
     * @param p - Representa a la persona a la que se le hace el contrato
     * @param poliza - Representa la póliza que figura en el contrato
     * @param c - Representa la compañía que formaliza el ocntrato
     */
    
    public ContratoDeSeguros(int i, String f, Persona p, PolizaDeSeguros poliza,
                             CompañiaDeSeguros c) {
        this.id = i;
        this.fechaFirma = f;
        this.persona = p;
        this.poliza = poliza;
        this.compañia = c;
    }
    
    /**
     * Constructor por defecto
     */
    
    public ContratoDeSeguros() {
    }

    @Override
    public String toString() {
        return "ContratoDeSeguros{" + "id=" + id + ", fechaFirma=" + fechaFirma + ", persona=" + persona + ", poliza=" + poliza + ", compa\u00f1ia=" + compañia + '}';
    }
    
}
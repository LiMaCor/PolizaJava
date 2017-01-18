package Modelo;

/**
 *
 * @author PixelZer0
 */
public class Persona {
    
    // Variables
    
    private String nombre, direccion, dni;
    private int edad;
    
    /**
     * Metodo constructor
     * @param n - Representa el nombre de la persona
     * @param d - Representa la dirección de la persona
     * @param dni - Representa el dni de la persona
     * @param e - Representa la edad de la persona
     */
    
    public Persona(String n, String d, String dni, int e) {
        this.nombre = n;
        this.direccion = d;
        this.dni = dni;
        this.edad = e;
    }
    
    /**
     * Constructor por defecto
     */
    
    public Persona() {
    }

    /**
     * Método para mostrar los datos como cadenas de texto
     * @return String
     */
    
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", direccion=" + direccion + 
                ", dni=" + dni + ", edad=" + edad + '}';
        
    }
}
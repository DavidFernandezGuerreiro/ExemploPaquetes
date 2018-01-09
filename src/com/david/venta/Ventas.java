
package com.david.venta;
import exemplopaquetes.Coches;
/**
 *
 * @author dfernandezguerreiro
 */
public class Ventas {
    private Coches coche;
    private int prezo;
    private String marca;

    public Ventas() {
    }

    public Ventas(Coches coche, int prezo, String marca) {
        this.coche=coche;
        this.prezo=prezo;
        this.marca=marca;
    }

    public Coches getCoche() {
        return coche;
    }

    public void setCoche(Coches coche) {
        this.coche=coche;
    }

    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        this.prezo=prezo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca=marca;
    }

    @Override
    public String toString() {
        return "Coche : "+coche+", prezo = "+prezo+", marca = "+marca;
    }
    
    
}

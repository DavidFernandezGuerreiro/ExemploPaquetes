
package com.david.taller;
import exemplopaquetes.Coches;
/**
 *
 * @author dfernandezguerreiro
 */
public class Taller {
    private Coches matricula;
    private float factura;

    public Taller() {
    }

    public Taller(Coches matricula, float factura) {
        this.matricula=matricula;
        this.factura=factura;
    }

    public Coches getMatricula() {
        return matricula;
    }

    public void setMatricula(Coches matricula) {
        this.matricula=matricula;
    }

    public float getFactura() {
        return factura;
    }

    public void setFactura(float factura) {
        this.factura=factura;
    }

    @Override
    public String toString() {
        return "Matricula : "+matricula+", factura = "+factura;
    }
    
    public void costeArranxo(String matricula){
        if(matricula==this.matricula.getMatricula()){
            System.out.println("\nO coche foi mercado en CochesVigo. Desconto do 20%.");
            factura=factura-(factura*20)/100;
        }else{
            System.out.println("\nO coche non foi comprado en CochesVigo. Non hai desconto.");
        }
    }
    
    
}

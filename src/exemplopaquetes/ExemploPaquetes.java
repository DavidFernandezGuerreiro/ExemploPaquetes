
package exemplopaquetes;
import com.david.venta.Ventas;
import com.david.taller.Taller;
/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploPaquetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Coches coche1=new Coches("1111");
        Ventas coh1=new Ventas(coche1,12000,"Citroen");
        Taller coh2=new Taller(coche1,500F);
        Taller coh3=new Taller(coche1,500F);
        System.out.println(coh1.toString());
        coh2.costeArranxo("1111");
        System.out.println(coh2.toString());
        coh3.costeArranxo("2222");
        System.out.println(coh3.toString());
        
    }
    
}

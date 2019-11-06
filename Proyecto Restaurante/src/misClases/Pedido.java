
package misClases;

import javax.swing.JOptionPane;

public class Pedido {
    private static final int TAM = 4;
    private Plato[] arPlatos;
    private float monto;

    public Pedido() {
        arPlatos = new Plato[TAM];
        monto = 0.0f;
    }

    public static int getTAM() {
        return TAM;
    }
    public Plato[] getArPlatos() {
        return arPlatos;
    }
 
    public float getMonto() {
        return monto;
    }
   
    public void agregarPlato(Plato refP){
        
        if(refP.getCantidad() < TAM){
            arPlatos[0] = refP;
            npl ++;
        }else{
            JOptionPane.showMessageDialog(null, "El pedido está lleno");
        }
    }
    public void calcularMonto(){
        for (int i = 0; i < npl; i++) {
            
        }
    }

}

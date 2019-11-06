
package misClases;

import javax.swing.JOptionPane;

public class Pedido {
    private static final int TAM = 4;
    private Plato[] arPlatos;
    private int npl;
    private float monto;

    public Pedido() {
        arPlatos = new Plato[TAM];
        npl = 0;
        monto = 0.0f;
    }

    public static int getTAM() {
        return TAM;
    }
    public Plato[] getArPlatos() {
        return arPlatos;
    }
    public int getNpl() {
        return npl;
    }
    public float getMonto() {
        return monto;
    }
    
    public void agregarPlato(Plato refP){
        if(npl < TAM){
            arPlatos[npl] = refP;
            npl ++;
        }else{
            JOptionPane.showMessageDialog(null, "El pedido está lleno");
        }
    }
    public void calcularMonto(){
        
    }
    
}


package misClases;

import javax.swing.JOptionPane;

public class Pedido {
    private static final int TAM = 4;
    private Plato[] arPlatos;
    private float monto;
    private int numeroP;

    public Pedido() {
        arPlatos = new Plato[TAM];
        monto = 0.0f;
        numeroP = 0;
    }
    public int getNumeroP() {
        return numeroP;
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
     
        if(numeroP <= TAM){
            arPlatos[numeroP] = refP;
            numeroP ++;
            }else{
                JOptionPane.showMessageDialog(null, "Faltan platos,debe ser 4 platos");
            }      
            
    }
    public void calcularMontoTotalPagar(){
        for (int i = 0; i <numeroP ; i++) {
            monto+= arPlatos[i].getPrecioU()*arPlatos[i].getCantidad();
        }
    }
    public String toString(){
        String cad ="";
        for (int i = 0; i < TAM; i++) {
            cad += arPlatos[i].toString() +"\n";
            
        }
         
               
         
        return cad + "\nMonto por Pedido: "+monto;
    }

}

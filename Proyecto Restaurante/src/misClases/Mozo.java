
package misClases;

import javax.swing.JOptionPane;
import miClaseCola.ArrayCola;

public class Mozo {
    private String apellido;
    private int añosExperiencia;
    private ArrayCola<Pedido> listaPedido;
    private float montoRecaudacion;

    public Mozo(String apellido, int añosExperiencia) {
        this.apellido = apellido;
        this.añosExperiencia = añosExperiencia;
        listaPedido=new ArrayCola<Pedido>();
        montoRecaudacion=0.0f;
    }

    public String getApellido() {
        return apellido;
    }
    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    public ArrayCola<Pedido> getListaPedido() {
        return listaPedido;
    }
    public float getMontoRecaudacion() {
        return montoRecaudacion;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    public void encolarPedido(Pedido refP){
        while (refP.getNumeroP() !=4) {            
            JOptionPane.showMessageDialog(null, "Necesita 4 platos en el pedido ");
        }
        if(refP.getNumeroP() == 4){
            listaPedido.encolar(refP);
        }else{
            
        }
    }
    
    public void calcularMontoMozo(){
        ArrayCola<Pedido> cAux=new ArrayCola<Pedido>();
        while(listaPedido.colaVacia()==false){
            Pedido p=listaPedido.desencolar();
            montoRecaudacion += p.getMonto();
            cAux.encolar(p);
        }
        while(!cAux.colaVacia()){
            listaPedido.encolar(cAux.desencolar());
        }
    }
    public String toString(){
        return "\nApellido: "+apellido+
                "\nAños de experiencia: "+añosExperiencia+
                "\n"+listaPedido.verColaDeDatos()+
                "\nMonto recaudado: "+montoRecaudacion;
    }
    
}

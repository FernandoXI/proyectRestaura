
package miClaseListaE;

import javax.swing.JFrame;
import misClases.Mozo;
import misClases.Pedido;
import misClases.Plato;


public class main{
    public static void main(String[] args){
        Mozo m = new Mozo("Hueso", 1);
        Pedido objG=new Pedido();
        Plato PlatoA=new Plato("Ceviche de conchas negras");
        PlatoA.generarCantidad();
        PlatoA.asignarPrecio();     
        objG.agregarPlato(PlatoA);
        
        Plato PlatoB=new Plato("Chaufa con mariscos");
        PlatoB.generarCantidad();
        PlatoB.asignarPrecio();     
        objG.agregarPlato(PlatoB);
        
        Plato PlatoC=new Plato("Leche de tigre");
        PlatoC.generarCantidad();
        PlatoC.asignarPrecio();     
        objG.agregarPlato(PlatoC);
        
        Plato PlatoD=new Plato("Chicharrón de pescado");
        PlatoD.generarCantidad();
        PlatoD.asignarPrecio();     
        objG.agregarPlato(PlatoD);
        
        objG.calcularMontoTotalPagar();
        m.encolarPedido(objG);
        m.calcularMontoMozo();
        System.out.println(objG.getMonto());
        
        System.out.println(m.toString());
    }
}


package miClaseListaE;

import java.util.Random;
import javax.swing.JOptionPane;
import miClaseCola.ArrayCola;
import misClases.Mozo;
import misClases.Pedido;

public class ListaLEG<E extends Mozo> {

    private NodoLEG<E> primero;
    private int talla;

    public ListaLEG() {
        this.primero = null;
        this.talla = 0;
    }

    public NodoLEG<E> getPrimero() {
        return primero;
    }

    public int getTalla() {
        return talla;
    }

    public void insertarAlInicio(E x) {
        NodoLEG<E> nuevo = new NodoLEG<E>(x);
        nuevo.setSiguiente(primero);
        primero = nuevo;
        talla++;
    }

    public void insertarAlFinal(E x) {
        NodoLEG<E> nuevo = new NodoLEG<E>(x);

        if (primero == null) {
            primero = nuevo;
        } else {
            NodoLEG<E> ptr = primero;
            while (ptr.getSiguiente() != null) {
                ptr = ptr.getSiguiente();
            }
            ptr.setSiguiente(nuevo);
        }
        talla++;
    }

    public void eliminarAlInicio() {

        if (primero.getSiguiente() == null) {
            primero = null;
        } else {
            primero = primero.getSiguiente();
        }
        talla--;
    }

    public void eliminarAlFinal() {

        if (primero.getSiguiente() == null) {
            primero = null;
        } else {
            NodoLEG<E> ptr = primero, r = null;
            while (ptr.getSiguiente() != null) {
                r = ptr;
                ptr = ptr.getSiguiente();
            }
            r.setSiguiente(null);
        }
        talla--;
    }

    public String verLista() {
        String cad = "";

        NodoLEG<E> ptr = primero;
        while (ptr != null) {
            cad += ptr.getDato().toString() + "\n";
            ptr = ptr.getSiguiente();
        }
        return cad;
    }


    public void agregarMozoXApellido(E x) {
        NodoLEG<E> ptr = primero, ant=null;
        boolean estado = false;
        if (primero == null ) {
            insertarAlFinal(x);
        }else{
            while (ptr != null && !estado) {
                if (ptr.getDato().getApellido().equalsIgnoreCase(x.getApellido())) {
                    estado = true;
                    JOptionPane.showMessageDialog(null, "El Mozo con ese apellido ya existe");
                    
                }
                ptr = ptr.getSiguiente();
            }
            while (ptr != null && ptr.getDato().getApellido()
                    .compareToIgnoreCase(x.getApellido())<0) {                
                ant = ptr;
                ptr = ptr.getSiguiente();
            }
            if(ptr != null){
                if(ptr == primero){
                    insertarAlInicio(x);
                }else{
                    NodoLEG<E> nuevo = new NodoLEG<E>(x);
                    ant.setSiguiente(nuevo);
                    nuevo.setSiguiente(ptr);
                    talla++;
                }
            }else{
                insertarAlFinal(x);
            }
        }
        

    }
    
    public void agregarPedidoAl(Pedido refP){
        Random randito = new Random();
        int mozo= randito.nextInt(talla)+1;
        NodoLEG<E> ptr = primero,ant=null;
        int cont = 0;
        while (ptr != null) {            
            if(cont == mozo){
                ant = ptr;
            }
            ptr=ptr.getSiguiente();
            ant.getDato().encolarPedido(refP);
        }
    }
    
    public String PedidoMozoAntiguo(){
        String cad ="";
        NodoLEG<E> ptr = primero;
        int mayor = 0;
        while (ptr != null) {            
            if(ptr.getDato().getAñosExperiencia()>mayor){
                mayor = ptr.getDato().getAñosExperiencia();                         
            }
            ptr = ptr.getSiguiente();
        }
        while (ptr != null ) {            
            if(ptr.getDato().getAñosExperiencia()==mayor){
                cad += "\n Datos del Mozo: \n"+ptr.getDato().toString();
                float pago =0.0f;
                while (ptr.getDato().getListaPedido().colaVacia()==false) {                    
                    Pedido p = ptr.getDato().getListaPedido().desencolar();
                    pago += p.getMonto();
                    cad += "\nPedido: "+p.toString()+
                            "\nMonto de Pago: "+pago; 
                }
            }
            ptr = ptr.getSiguiente();
        }
        
        return cad;
    }
    

}

package miClaseListaE;

import java.util.Random;
import misClases.Mozo;

public class ListaLEG <E extends Mozo>{
    private NodoLEG<E> primero;
    private int talla;

    public ListaLEG() {
        this.primero=null;
        this.talla=0;//no hay nodos, esta vacio la lista
    }
    public NodoLEG<E> getPrimero() {
        return primero;
    }
    public int getTalla() {
        return talla;
    }
    public void insertarAlInicio(E x){        
        NodoLEG<E> nuevo=new NodoLEG<E>(x);//construyendo una direccion de memoria
        //se inicializa todo,xq estamosllamando al contructor
        nuevo.setSiguiente(primero);
        primero=nuevo;
        talla++;        
    }
    public void insertarAlFinal(E x){
        NodoLEG<E> nuevo=new NodoLEG<E>(x);
        
        if(primero==null){//lista vacia
            primero=nuevo;
        }else{
            NodoLEG<E> ptr=primero;
            while(ptr.getSiguiente()!=null){//recorrer toda la lista hasta quedarme en el ultimo nodo
                ptr=ptr.getSiguiente();
            }
            ptr.setSiguiente(nuevo); //direccion del ultimo nodo          
        }
        talla++; //se acaba de insertar un nuevo elemento       
    }   
    public void eliminarAlInicio(){
        //precondición: Lista no vacia
        
        //caso especial
        if(primero.getSiguiente()==null){
            primero=null;
        }else{
            primero=primero.getSiguiente();
        }
        talla--;        
    }    
    public void eliminarAlFinal(){
        //precondición: Lista no vacia
        
        if(primero.getSiguiente()==null){//la lista enlazada tiene un solo nodo
            primero=null;//la lista queda vacia
        }else{
            NodoLEG<E> ptr=primero,r=null;
            while(ptr.getSiguiente()!=null){//caso contrario,recorrer la lista hasta quedarnos en la ultima direccion de lalista
                r=ptr;
                ptr=ptr.getSiguiente();
            }
            r.setSiguiente(null);           
        }
        talla--;       
    }   
    public String verLista(){
        String cad="";
        
        NodoLEG<E> ptr=primero;//inicializacion de la lista
        while(ptr!=null){
            cad+=ptr.getDato().toString()+"\n";
            ptr=ptr.getSiguiente();
        }       
        return cad;        
    }    
    public void eliminarDatoAleatorio(){
        Random randito=new Random();
        
        int posNodo=randito.nextInt( talla)+1;
        
        //falta terminar
        
        
    } 
    
    
}

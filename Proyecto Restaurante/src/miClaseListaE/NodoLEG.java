package miClaseListaE;

public class NodoLEG <E>{//plantilla clase generica de tipo E
    private E dato;
    private NodoLEG<E> siguiente;

    public NodoLEG(E dato) {
        this.dato = dato;
        this.siguiente=null;//nulo o vacio, se hace eso en JAVA
    }

    public E getDato() {
        return dato;
    }
    public void setDato(E dato) {
        this.dato = dato;
    }
    public NodoLEG<E> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoLEG<E> siguiente) {
        this.siguiente = siguiente;
    }
         
    
}

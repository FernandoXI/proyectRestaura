package miClaseCola;

import javax.swing.JOptionPane;


public class ArrayCola <E> implements Cola<E>{//nombre de la estructura de dato ,va almacenar objetos de 
                                                //tipo generico
    private static final int TAM=50;
    
    private E[]arC; //arreglo cola
    private int frente,finalc;//almacena la posicion

    public ArrayCola() {
        arC=(E[]) new Object[TAM];      
        frente=-1;          //cola vacia
        finalc=-1;        
    }
    
    //Reglas de negocio
    public boolean colaVacia(){
        return (frente==-1 && finalc==-1);
    }
    
    public boolean colaLlena(){
        return ( (frente==0 && finalc==TAM-1) || frente==finalc+1 );
        //frente apunta a cero y final coincida con el tamaño -1
        //estructura circular por eso frente==finalc+1
    }
    
    public void encolar(E x){  //para encolar ,la cola no tiene que estar llena      
        if(colaLlena()==false){//significa que hay espacio
            //caso especial
            if(colaVacia()==true){
                frente=0;
                finalc=0;
            }else if(finalc==TAM-1){
                finalc=0;
            }else{
                finalc++;
            }
            arC[finalc]=x;            
        }else{
            JOptionPane.showMessageDialog(null, "Cola Llena");
        }       
    }
    
    public E frenteC(){
        return arC[frente];//retorna el objeto sin modificarlo,solo atrapa el valor pero no lo elimina
    }
    public E desencolar(){
        E elemento=arC[frente];//capturamos lo que esta en el frentede la cola
        
        if(frente==finalc){ //cuando hay un solo elemento
            frente=-1;
            finalc=-1;
        }else if(frente==TAM-1){
            frente=0;
        }else{
            frente++;
        }
        return elemento;        
    }
    public void eliminarUltimo(){
        ArrayCola<E> cAux=new ArrayCola<E>();
        
        while (!colaVacia()){
            E x=desencolar();
            
            if(!colaVacia()){
                cAux.encolar(x);
            }            
        }
        while(!cAux.colaVacia()){
            encolar(cAux.desencolar());
        }       
    }
    
    public String verColaDeDatos(){
        String cad="";
        
        ArrayCola<E> cAux=new ArrayCola<E>();
        
        while(!colaVacia()){
            E valor=desencolar();
            cad=cad+valor +"  ";
            cAux.encolar(valor);
        }
        
        while(!cAux.colaVacia()){
            encolar(cAux.desencolar());
        }       
        return cad;
    }
    
    
    
    
}

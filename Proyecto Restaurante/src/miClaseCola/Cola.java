package miClaseCola;

public interface Cola <E>{//clase generica, con objeto tipo genérico
    void encolar(E x);
    E desencolar();
    E frenteC();                    // método consultor
    boolean colaVacia();
    boolean colaLlena();   
}


package misClases;

import java.util.Random;
import javax.swing.JOptionPane;

public class Plato {
    private String descripcion;
    private int cantidad;
    private float precioU;

    public Plato(String descripcion) {
        this.descripcion = descripcion;
        cantidad=0;
        precioU=0.0f;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public int getCantidad() {
        return cantidad;
    }
    public float getPrecioU() {
        return precioU;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void generarCantidad(){
        Random randito =new Random();
        cantidad=randito.nextInt(6)+1;
        JOptionPane.showMessageDialog(null,cantidad);
    }
    
    public void asignarPrecio(){
        if(descripcion.equalsIgnoreCase("Ceviche mixto")){
            precioU=30.0f;
        }else if(descripcion.equalsIgnoreCase("Ceviche de conchas negras")){
            precioU=40.0f;
        }else if(descripcion.equalsIgnoreCase("Ceviche de mariscos")){
            precioU=40.0f;
        }else if(descripcion.equalsIgnoreCase("Arroz con mariscos")){
            precioU=35.0f;
        }else if(descripcion.equalsIgnoreCase("Chaufa con mariscos")){
            precioU=35.0f;
        }else if(descripcion.equalsIgnoreCase("Chicharrón de pescado")){
            precioU=38.0f;
        }else if(descripcion.equalsIgnoreCase("Chicharrón de Calamar")){
            precioU=50.0f;
        }else if(descripcion.equalsIgnoreCase("Leche de tigre")){
            precioU=20.5f;
        }else if(descripcion.equalsIgnoreCase("Parihuela de pescado")){
            precioU=45.0f;
        }else{
            precioU=45.0f;
        }
    }
    public String toString(){
        return "\nDescripcion de Plato: "+descripcion+
                "\nCantidad de Plato: "+cantidad+
                "\nPrecio Unitario: "+precioU;
    }
    
    
}

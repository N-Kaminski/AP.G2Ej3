
package guia2ejercicio3.listaproductos;

/** @author Nicolas Kaminski */

public class Productos {
    
    private String nombre, categoria;
    private double precio;

    public Productos(String categoria, String nombre, double precio) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", categoria=" + categoria + ", precio=" + precio + '}';
    }
    
    



}  // LLAVE DE CLASE

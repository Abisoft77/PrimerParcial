package dominio;

public class Producto {
    private String nombre;
    private String codigo;
    private double precio;

    public Producto(String codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;

    }
    public String getNombre(){
        return this.nombre;
    }



}

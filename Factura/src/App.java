import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;
import dominio.Producto;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Producto producto;
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto("101", "Gel Antibacterial A", 40.00));
        productos.add(new Producto("102", "Gel Antibacterial B", 54.99));
        productos.add(new Producto("103", "Gel Antibacterial C", 72.80));
        productos.add(new Producto("104", "Gel Antibacterial D", 73.00));
        System.out.println("__________________________");
        System.out.println("*******Venta de gel antibacterial*******");
        System.out.println("=========================================");
        System.out.print("Ingrese dato");
        var dato = entrada.nextInt();   


        for(int i = 0; i<3; i++){
            
            System.out.print("Codigo del producto :  ");
            var codigo = entrada.next();
            for (Producto prod : productos) {
                if(codigo.equals(prod)){
                    System.out.println(prod.getNombre());
                }
            }

        }


    }
}

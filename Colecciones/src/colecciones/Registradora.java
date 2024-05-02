package colecciones;

import java.util.HashSet;

public class Registradora {
    
    private static HashSet<Producto> lista = new HashSet<>();
    private static boolean compraIniciada = false;
    
    public static void iniciarCompra(){
        compraIniciada = true;
        System.out.println("Se ha abierto un carrito.");
    }
    
    public static void agregarProducto(Producto p, int cant){
        if(compraIniciada){
            if(cant >= 1){
                p.setCantidad(cant);
                lista.add(p);
                System.out.println("Se ha agregado el producto " +p.getNombre() +" x" +p.getCantidad() +" al carrito.");
            } else{
                System.out.println("Cantidad de " +p.getNombre() +" no valida.");
            }
            
        } else{
            System.out.println("No se ha inciado ninguna compra.");
        }

    }
    public static void agregarProducto(Producto p){
        agregarProducto(p, 1);
    }
    
    public static void finalizarCompra(){
        if(compraIniciada){
            double total = 0;
            System.out.println("");
            System.out.println("TICKET:");
            for (Producto p : lista) {
                System.out.println(p.getNombre() +" x" +p.getCantidad() +" $" +(p.getCantidad()* p.getPrecio()));
                total += (p.getCantidad()* p.getPrecio());
            }
            System.out.println("");
            System.out.println("Total: $" + total);
            System.out.println("");
            compraIniciada = false;
            lista.clear();
            
        } else{
            System.out.println("No hay ninguna compra para finalizar.");
        }
    }
    
    
}

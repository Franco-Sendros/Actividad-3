package colecciones;

import java.util.Arrays;
import java.util.Random;

public class Colecciones {

    public static void llenarArray(int[] array) {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(array.length + 1);
        }
    }

    public static void main(String[] args) {

        // EJERCICIO 1
        System.out.println("EJERCICIO 1");
        int longitudArray = 1000;
        int[] myArray = new int[longitudArray];
        llenarArray(myArray);

        Arrays.sort(myArray);
        System.out.println("el mayor elemento es : " + myArray[longitudArray - 1]);
        System.out.println("el menor elemento es : " + myArray[0]);

        /*
        for (int num : myArray) {
            System.out.println(num);
        }*/
        
        System.out.println();
        System.out.println("EJERCICIO 2");
        // EJERCICIO2
        
        int[] array1k = new int[1000];        
        int[] array10k = new int[10000];
        int[] array100k = new int[100000];
        
        llenarArray(array1k);
        llenarArray(array10k);
        llenarArray(array100k);
        
        Cronometro.empezar();
        Arrays.sort(array1k);
        System.out.println("EL ARRAY DE 1K TARDO: " +Cronometro.finalizar() +"ms");
        Cronometro.reset();
        
        Cronometro.empezar();
        Arrays.sort(array10k);
        System.out.println("EL ARRAY DE 10K TARDO: " +Cronometro.finalizar() +"ms");
        Cronometro.reset();
        
        Cronometro.empezar();
        Arrays.sort(array100k);
        System.out.println("EL ARRAY DE 100K TARDO: " +Cronometro.finalizar() +"ms");
        Cronometro.reset();
        
        System.out.println();
        System.out.println("EJERCICIO 3");
        // EJERCICIO3
        Producto arroz = new Producto("Arroz Pollo", 1.50);
        Producto fideos = new Producto("Fideos Mantol", 1.80);
        Producto dulceDeLeche = new Producto("Dulce De Leche LaSelena", 3.0);
        Producto azucar = new Producto("Azucar Ledesma", 1.20);
        Producto yerba = new Producto("Yerba Plana", 4.10);
        Producto carne = new Producto("Carne", 10);
        
        Registradora.iniciarCompra();
        Registradora.agregarProducto(carne);
        Registradora.agregarProducto(arroz, 2);
        Registradora.agregarProducto(dulceDeLeche);
        Registradora.agregarProducto(fideos, 4);
        Registradora.finalizarCompra();
        
        Registradora.iniciarCompra();
        Registradora.agregarProducto(carne);
        Registradora.agregarProducto(arroz, 0);
        Registradora.agregarProducto(dulceDeLeche);
        Registradora.agregarProducto(fideos, 4);
        Registradora.finalizarCompra();
        
        //test
        System.out.println("");
        System.out.println("TEST");
        Registradora.finalizarCompra();
        Registradora.agregarProducto(carne);
        
    }

}


package colecciones;


public class Cronometro {
    
    
    private static long tiempoInicial;
    private static long tiempoTotal;
    private static boolean funcionando;

    public static void empezar() {
        if (!funcionando) {
            tiempoInicial = System.currentTimeMillis();
            funcionando = true;
        } else {
            System.out.println("El cronometro ya esta en funcionamiento");
        }
    }

    public static double finalizar() {
        if (funcionando) {
            tiempoTotal = System.currentTimeMillis() - tiempoInicial;
            funcionando = false;
            return tiempoTotal;
        } else {
            return -1;
        }
    }

    public static void reset() {
        tiempoTotal = 0;
        tiempoInicial = 0;
        funcionando = false;
        System.out.println("Cronometro reseteado.");
    }
    
}

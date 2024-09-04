import javax.print.attribute.standard.OrientationRequested;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Tiposdedatos2 {
    public static void main(String[] args) {
        //int[] lista = {51,21,39,80,36,38,23};
        Principal.generarLista();
        int[] listaOrdenada;
        ordenamiento.OrdenamientoDirecto od = new ordenamiento.OrdenamientoDirecto();
        mostrarLista(Principal.lista);
        long tinicio = System.nanoTime();
        listaOrdenada = od.burbujaAscendente(Principal.lista);
        long  tfinal = System.nanoTime();
        long tejecutado = tfinal - tinicio;
        //mostrarLista(listaOrdenada);
        //listaOrdenada = od.burbujaDescendente(lista);
        mostrarLista(listaOrdenada);
       /*
       OrdenamientoIndirecto oi = new OrdenamientoIndirecto();
       //mostrarLista(lista);
        long tinicio = System.nanoTime();
       oi.mergeSortAscendente(lista, 0, lista.length);
        long  tfinal = System.nanoTime();
        long tejecutado = tfinal - tinicio;
       mostrarLista(lista);
       */
        System.out.println("Tiempo: " + tejecutado);
    }
//    public static long suma(long n){
//        double numero = 0;
//        if (n == 1) {
//            numero = n;
//            System.out.println(numero);
//            return 1;
//        }
//
//        else{
//            numero = n;
//            System.out.println(numero);
//            return   n + suma(n-1);
//        }
//    }

public static long suma(long n){
    double numero = 0;
    if (n == 1) return 1;
    else return   n + suma(n-1);

}
public static long potencia(long numero,int elevado){
     if (elevado == 0) return 1;
     else return numero*potencia(numero,elevado-1);
}
    public class Potencia1 {
        public static int potencia(int base, int exponente) {
            int resultado = 1;
            for (int i = 0; i < exponente; i++) {
                resultado *= base;
            }
            return resultado;
        }
    }

    public static int[] bublesort(int matriz[]){
        int buffer;
        int i,j;
        for (i = 0; i < matriz.length; i++) {
            for (j = 0; j < matriz.length; j++) {
                if (matriz[i] < matriz[j]) {
                    buffer = matriz[j];
                    matriz[j] = matriz[i];
                    matriz[i] = buffer;
                }
            }
        }
        return matriz;
    }
    static void mostrarLista(int[] lista) {
        System.out.print("Lista: ");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i]+ " ");
        }
        System.out.println();
    }

    public static void ordInsercion(int[]a){
        int i, j;
        int aux;
        for (i = 1; i < a.length; i++) {
            j=i;
            aux=a[i];
            while (j > 0 && aux < a[j-1]){
                a[j] = a[j-1];
                j--;
            }
            a[j] = aux;
        }
    }

}
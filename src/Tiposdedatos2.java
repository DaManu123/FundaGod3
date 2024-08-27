import java.util.ArrayList;
import java.util.Collections;
public class Tiposdedatos2 {
    public static void main(String[] args) {
//        char [] arregloCaracteres1= {'a','e','i','o','u'};
//        String cadena1 = "aeiou";
//        System.out.println(cadena1);
//
//        for (int i = 0; i < arregloCaracteres1.length; i++) {
//
//            System.out.println(""+(char)(arregloCaracteres1[i]-32));
//
//        }
//        System.out.println("");
//        System.out.println(""+cadena1.toUpperCase());
//        System.out.println(""+cadena1.charAt(0));
//        int [] numeros1 = new int[5];
//        numeros1[0]=7;
//        numeros1[1]=3;
//        numeros1[2]=9;
//        numeros1[3]=6;
//        numeros1[4]=4;
//
//        ArrayList<Integer> numero2 = new ArrayList<Integer>();
//        numero2.add(7);
//        numero2.add(3);
//        numero2.add(9);
//        numero2.add(6);
//        numero2.add(4);
//
//        System.out.println("no ordenao xd");
//        for (int i = 0; i < numero2.size(); i++) {
//            System.out.println(numero2.get(i));
//        }
//        Collections.sort(numero2);
//
//        System.out.println("si oredenao xd");
//        for (int i = 0; i < numero2.size(); i++) {
//            System.out.println(numero2.get(i));
//        }
//        long num;
        long tinicio = System.nanoTime();
        long res = potencia(5,3);
        //long res2=Potencia1(3,2);
//        long suma1 = suma(999999);
//
        long tfinal = System.nanoTime();
        long ejecutado = tfinal - tinicio;
//        System.out.println("Suma: " + suma1);
        System.out.println("el tiempo es: "+ejecutado);


        System.out.println("El resultado es: "+res);
        int matriz[]={51,21,39,80,36};
        for (int i = 0; i < matriz.length;i++) {
            System.out.println(matriz[i]);
        }

        System.out.println("\t");

        int matriz2[] = bublesort(matriz);
        for (int i = 0; i < matriz2.length;i++) {
            System.out.println(matriz2[i]);
        }
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
}

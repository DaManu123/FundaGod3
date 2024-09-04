public class Principal {
    static int[] lista = new int[100];
    static void generarLista(){
        for(int i=0; i<100; i++){
            lista[i] = (int)(Math.random()*100)+1;
        }
    }
    static void mostrarLista(int[] lista){
        System.out.println("Lista: ");
        for(int i=0; i<lista.length; i++){
            System.out.print(lista[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        //int[] lista = {51,21,39,80,36,38,23};
        generarLista();
        ordenamiento.OrdenamientoDirecto od = new ordenamiento.OrdenamientoDirecto();
        mostrarLista(lista);
        long tinicio = System.nanoTime();
        lista = od.burbujaDescendente(lista);
        long  tfinal = System.nanoTime();
        long tejecutado = tfinal - tinicio;
        mostrarLista(lista);

       /*
       OrdenamientoIndirecto oi = new OrdenamientoIndirecto();
       mostrarLista(lista);
        long tinicio = System.nanoTime();
       oi.mergeSortDescendente(lista, 0, lista.length);
        long  tfinal = System.nanoTime();
        long tejecutado = tfinal - tinicio;
       mostrarLista(lista);
       */
        System.out.println("Tiempo: " + tejecutado);
    }
}

import Pcs.Cola;
import lse.Lista;

public class Main {
    public static void main(String[] args) {
        /*Lista lista=new Lista();
        System.out.println(lista.estaVacia());
        lista.insertar(0);
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        //
        lista.mostrar();
        //
        lista.eliminar();
        //
        lista.mostrar();*/
        Cola cola=new Cola();
        System.out.println(cola.estaVacia());
        for (int i = 1; i <=8 ; i++) {
            cola.insertar(i);
        }
        cola.mostrar();
        //
        cola.eliminar();
        cola.eliminar();
        cola.eliminar();
        cola.mostrar();
    }
}

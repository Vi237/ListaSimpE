package Pcs;

import lse.Lista;
import lse.Nodo;

public class Cola extends Lista {
    @Override
    public void insertar(Object dato) {
        if(estaVacia()){
            Nodo nuevo=new Nodo(dato,null);
            primero=nuevo;
        }else {
            Nodo ultimo=primero;
            while(ultimo.getSiguiente()!=null){
                ultimo=ultimo.getSiguiente();
            }
            Nodo nuevo=new Nodo(dato,null);
            ultimo.setSiguiente(nuevo);
        }
    }
}

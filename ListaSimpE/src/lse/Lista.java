package lse;

public class Lista {
    protected Nodo primero;
    public Lista(){
        primero=null;
    }
    public boolean estaVacia(){
        return primero==null;
    }
    public void insertar(Object dato){
        if(estaVacia()){
            Nodo nuevo=new Nodo(dato,null);
            primero=nuevo;
        }else {
            Nodo nuevo=new Nodo(dato,primero);
            primero=nuevo;
        }
    }
    public void eliminar(){
        if(!estaVacia()){
            primero=primero.getSiguiente();
        }
    }
    public void mostrar(){
        Nodo aux=primero;
        while(aux!=null){
            System.out.print(aux.getDato()+"  ");
            aux=aux.getSiguiente();
        }
        System.out.println();
    }
}

package newpackage;

import java.util.EmptyStackException;

public class PilhaDinamica implements TADPilha {

    private Node topo;
    private int i;

    public PilhaDinamica() {
        topo = null;
        i = 0;
    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public int size() {
        return i;
        
        //Node aux = topo;
        //int contador = 0;
        //while(aux != null){
        //    contador++;
        //    aux = aux.proximo;
        //}
        //return contador;
        
        
    }

    @Override
    public void push(char elemento) {
        Node novo = new Node(elemento);
        novo.proximo = topo;
        topo = novo;
        i++;
    }

    @Override
    public int pop() throws EmptyStackException {
        if(!isEmpty()){
            Node aux = topo;
            topo = topo.proximo;
            aux.proximo = null;
            i--;
            return aux.elemento;
        }
        throw new EmptyStackException();
    }

    @Override
    public char top() throws EmptyStackException {
         if(!isEmpty()){
            return topo.elemento;
        }
        throw new EmptyStackException();
    }

}

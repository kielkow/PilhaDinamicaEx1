package newpackage;

import java.util.EmptyStackException;

public interface TADPilha {
    
    public boolean isEmpty();
    public int size();
    public void push(char elemento);
    public int pop() throws EmptyStackException;
    public char top() throws EmptyStackException;
    
}

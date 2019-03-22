package newpackage;

public class TesteDinamico {
    
    
        public static void main(String[] args) {
            
            PilhaDinamica p = new PilhaDinamica();
            
            System.out.println(p.size());
            
            p.push('a');
            p.push('b');
            p.push('c');
            p.push('d');
            p.pop();
            
            System.out.println(p.top());
            System.out.println(p.size());
        }
}

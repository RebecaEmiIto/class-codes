/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package src;

import org.junit.Test;
import static org.junit.Assert.*;

public class ListaTest {
    @Test 
    public void testInserirUmElemento() {
        //montar o cenário
        Lista lista =  new Lista();
        Node n1 = new Node(1);

        // faz a ação
        lista.adicionar(n1);

        // executa o teste
        assertEquals(1, lista.getTamanho());        
    }

    @Test
    public void testInserirDoisElementos(){
        Lista lista = new Lista();
        Node n1 = new Node(1);
        Node n2 = new Node(2);

        lista.adicionar(n1);
        lista.adicionar(n2);

        assertEquals(2, lista.getTamanho());
        assertEquals(n2, lista.get(2));
    }


}

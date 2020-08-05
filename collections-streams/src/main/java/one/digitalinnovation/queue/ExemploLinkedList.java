package one.digitalinnovation.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploLinkedList {

    public static void main(String[] args) {
        Queue<String> filaDeBanco = new  LinkedList<>();

        filaDeBanco.add("Pamela");
        filaDeBanco.add("Patríca");
        filaDeBanco.add("Roberto");
        filaDeBanco.add("Flávio");
        filaDeBanco.add("Anderson");

        System.out.println(filaDeBanco);

        String clienteASerAtendido = filaDeBanco.poll();

        System.out.println(clienteASerAtendido);

        System.out.println(filaDeBanco);

        String primeiroCliente = filaDeBanco.peek();

        System.out.println(primeiroCliente);

        System.out.println(filaDeBanco);

        //filaDeBanco.clear(); // para testar um erro de execução logo abaixo

        String primeiroClienteOuErro = filaDeBanco.element();

        System.out.println(primeiroClienteOuErro);

        System.out.println(filaDeBanco);

        for (String cliente: filaDeBanco ) {
            System.out.println(cliente);
        }

        Iterator<String> iteratorFilaBanco = filaDeBanco.iterator();
        while (iteratorFilaBanco.hasNext()){
            System.out.println(iteratorFilaBanco.next());
        }

        System.out.println(filaDeBanco.size());
        System.out.println(filaDeBanco.isEmpty());

        filaDeBanco.add("Augusto");
        System.out.println(filaDeBanco);
    }
}

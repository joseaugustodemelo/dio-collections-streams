package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {

        Set<Integer> sequenciaNumerica = new LinkedHashSet<>();

        // Adiciona os numeros no set
        sequenciaNumerica.add(8);
        sequenciaNumerica.add(1);
        sequenciaNumerica.add(4);
        sequenciaNumerica.add(16);
        sequenciaNumerica.add(2);

        System.out.println(sequenciaNumerica);

        // Remove os numero do set
        sequenciaNumerica.remove(4);

        System.out.println(sequenciaNumerica);

        // Retorna a quantidade de itens do set
        System.out.println(sequenciaNumerica.size());

        // Navega em todos os itens do iterator
        Iterator<Integer> iterator = sequenciaNumerica.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (Integer nota : sequenciaNumerica) {
            System.out.println(nota);
        }

        sequenciaNumerica.clear();

        System.out.println(sequenciaNumerica.isEmpty());
    }
}

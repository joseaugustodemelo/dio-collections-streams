package one.digitalinnovation.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {

        TreeSet<String> treeCapitais = new TreeSet<>();

        // Monta a árvore com as capitais
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvore
        System.out.println(treeCapitais.first());

        // Retorna a última capital no final da ávore
        System.out.println(treeCapitais.last());

        // Retorna a primeira capita abaixa na árvore da capital parametrizada
        System.out.println(treeCapitais.lower("Florianópolis"));

        // Retorna a primeira capita acima na árvore da capital parametrizada
        System.out.println(treeCapitais.higher("Florianópolis"));

        // Exibe todas as capitas
        System.out.println(treeCapitais);

        // Retorna a primeira capital no topo da árvores, removendd do set
        System.out.println(treeCapitais.pollFirst());

        /// Retorna a primeira capital no final da árvores, removendd do set
        System.out.println(treeCapitais.pollLast());

        // Exibe todas as capitas
        System.out.println(treeCapitais);

        // Navega em todos os itens do iterator
        Iterator<String> iterator = treeCapitais.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String capital : treeCapitais) {
            System.out.println(capital);
        }

        treeCapitais.clear();

        System.out.println(treeCapitais.isEmpty());

    }
}

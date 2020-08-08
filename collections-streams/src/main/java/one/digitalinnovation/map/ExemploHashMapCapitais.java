package one.digitalinnovation.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ExemploHashMapCapitais {

    public static void main(String[] args) {
        Map<String, String> capitais = new HashMap<>();

        // Monta a árvore com as capitais
        capitais.put("RS", "Porto Alegre");
        capitais.put("PB", "João Pessoa");
        capitais.put("TO", "Palmas");
        capitais.put("RJ", "Rio de Janeiro");

        System.out.println(capitais);

        System.out.println(capitais.get("Rio de Janeiro"));
    }
}

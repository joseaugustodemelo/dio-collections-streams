package one.digitalinnovation.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FrutasStreamAPI {

    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        frutas = Arrays.asList("Maçã", "Laranja", "Banana", "Limão");

        System.out.println(frutas.stream().noneMatch(fruta -> fruta.length() >= 10));
        //System.out.println(frutas.stream().filter(fruta -> fruta.length() > 5 ).collect(Collectors.toList()));

        //System.out.println(frutas.stream().anyMatch(fruta -> fruta.contains("X")));

        //frutas.stream().map(fruta -> fruta + " - " + (fruta.length() * 2).collect(Collectors.toList()) --> a resposta desta questão está errada!

//        System.out.println(frutas.stream().min(Comparator.comparingInt(String::length)));

       // System.out.println(frutas.stream().collect(Collectors.groupingBy(fruta -> fruta.substring(0, 1))));

        //System.out.println(frutas.stream().min(Comparator.comparingInt(String::length)));
        /*System.out.println(frutas.stream().count());

        System.out.println(frutas.stream().max(Comparator.comparingInt(String::length)));*/
    }
}

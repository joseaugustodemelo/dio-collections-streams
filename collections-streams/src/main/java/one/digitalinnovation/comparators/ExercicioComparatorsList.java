package one.digitalinnovation.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class ExercicioComparatorsList {

    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Matheus", 22));
        estudantes.add(new Estudante("Carla", 65));
        estudantes.add(new Estudante("Joice", 15));
        estudantes.add(new Estudante("Talison", 19));


        Collections.sort(List.of(1,2,5));

    }
}

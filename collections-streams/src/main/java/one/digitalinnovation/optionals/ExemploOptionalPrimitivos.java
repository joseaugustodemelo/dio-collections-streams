package one.digitalinnovation.optionals;

import javax.xml.transform.sax.SAXSource;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {

    public static void main(String[] args) {

        /*System.out.println("***Valor inteiro opcional***");
        OptionalInt.of(12).ifPresent(System.out::println);

        System.out.println("***Valor decimal opcional***");
        OptionalDouble.of(55.0).ifPresent(System.out::println);*/

        OptionalDouble optionalDouble = OptionalDouble.of(25.5);
        System.out.println(optionalDouble.orElseThrow(IllegalStateException::new));


        /*System.out.println("***Valor longo opcional***");
        OptionalLong.of(23L).ifPresent(System.out::println);*/

    }
}

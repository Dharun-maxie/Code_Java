package Stream;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;

public class FE {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        Consumer<Integer> consumer =(integer) -> System.out.print(STR."\{integer} ");

        list.forEach(consumer);
        System.out.println();
        list.forEach(System.out::print);
    }
}

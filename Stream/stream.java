package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class stream {
    public static void main(String[] args) {

        List<Integer> lst = Arrays.asList(1,2,8,9,3,6,7,5);

        Stream<Integer> lst1= lst.stream().sorted();

        lst1.forEach(System.out::println);

    }
}

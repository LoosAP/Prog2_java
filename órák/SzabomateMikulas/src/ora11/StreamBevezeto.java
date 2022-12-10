package ora11;

import java.security.Key;
import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamBevezeto{
    public static void main(String[] args) {
        Stream<String> streamEmpty   = Stream.empty();

        Collection<String> collection = Arrays.asList("a","b","c");
        Stream<String> collectionStream = collection.stream();

        /*collectionStream.forEach(x -> System.out.println(x));
        Same as: */
        collectionStream.forEach(System.out::println);

        Stream<String> arrayStream = Stream.of("a","b","c");
        arrayStream.forEach(System.out::println);
        String[] arr = new String[]{"a","b","c"};
        Stream<String> arrayStreamFull = Arrays.stream(arr);
        Stream<String> arrayStreamPart = Arrays.stream(arr,1,3);
        arrayStreamPart.forEach(System.out::println);

        Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").add("d").add("e").build();
        streamBuilder.forEach(x -> System.out.println(x));
        Map<Key,Map> keyMapMap = new HashMap<>();
        Stream<String> generatedStream = Stream.generate(()-> "elem").limit(10);
        generatedStream.forEach(System.out::println);
        Stream<Integer> iteratedStream = Stream.iterate(40, n -> n+2).limit(20);
        iteratedStream.forEach(System.out::println);

        IntStream intStream = IntStream.range(1,3);
        LongStream longStream = LongStream.rangeClosed(1,3);
        longStream.forEach(System.out::println);
        Random random = new Random();
        DoubleStream doubleStream = random.doubles(3);
        doubleStream.forEach(System.out::println);

        IntStream charStream = "abc".chars();
        charStream.forEach(System.out::println);

        Stream<String> stringStream = Pattern.compile(", ").splitAsStream("a, b, c");
        stringStream.forEach(System.out::println);
    }

}

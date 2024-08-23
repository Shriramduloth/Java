package APIandAnnotation;

import java.util.Arrays;
import java.util.*;
import java.util.stream.*;

public class LaunchStreamapi {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(8, 4, 3, 5, 9);

        Stream<Integer> streamData = list.stream();

        // long count =streamData.count();
        // System.out.println(count);

        Stream<Integer> finalData = streamData.filter(n->n%2==0).sorted().map(n->n*2);
        // Stream<Integer> sortedStream = filData.sorted();

        // Stream<Integer> mapStream = sortedStream.map(n->n*2);
        finalData.forEach(n -> System.out.println(n));
        // streamData.forEach(n -> System.out.println(n));

    }
}

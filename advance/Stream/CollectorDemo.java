package advance.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Lalit","Kalu","Ravi");

        //toList()
        List<String> list = names.stream()
                .collect(Collectors.toList());
        System.out.println(list);


            //toSet()
        Set<String> set = names.stream()
                .collect(Collectors.toSet());
        System.out.println(set);


        //toMap()
        Map<String, Integer> map = names.stream()
                .collect(Collectors.toMap(n -> n, n -> n.length()));
        System.out.println(map);


        //joining
        String result = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(result);



        //counting
        long count = names.stream()
                .collect(Collectors.counting());
        System.out.println(count);


        //summingInt()
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40);
        int sum = numbers.stream()
                .collect(Collectors.summingInt(Integer::intValue));
        System.out.println("Sum = " + sum);


        //averagingInt()
        double avg = numbers.stream()
                .collect(Collectors.averagingInt(Integer::intValue));
        System.out.println("Avg = " + avg);


        //groupingBy()
        Map<Character, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(n -> n.charAt(0)));
        System.out.println(grouped);



        //partitioningBy()
        Map<Boolean, List<Integer>> partition = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(partition);


    }
}


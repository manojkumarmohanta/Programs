package pcDemo.stream;

import java.util.*;
import java.util.stream.*;
public class TestStream{
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2,3,4,5);
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println("square value"+ square);
        
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);
        List<String> result1 = names.stream().sorted().collect(Collectors.toList());
        System.out.println(result1);
    }
}
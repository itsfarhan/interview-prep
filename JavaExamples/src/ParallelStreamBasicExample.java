import java.util.*;
import java.util.stream.Collectors;

public class ParallelStreamBasicExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Sequential Stream:");
        numbers.stream()
                .map(n -> {
                    System.out.println("Processing " + n + " on thread: " + Thread.currentThread().getName());
                    return n * n;
                })
                .forEach(result -> System.out.println("Result: " + result));

        System.out.println("\nParallel Stream:");
        numbers.parallelStream()
                .map(n -> {
                    System.out.println("Processing " + n + " on thread: " + Thread.currentThread().getName());
                    return n * n;
                })
                .forEach(result -> System.out.println("Result: " + result));
    }
}
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(value -> value > 0)
                .filter(value -> value % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        
        filteredNumbers.forEach(System.out::println);
    }
}

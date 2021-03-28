package java_pratice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    private String[] arrayOfstr = {"java", "python", "swift", "go", "php"};
    
    @Test
    public void testStreamElementToUpper() {
        List<String> strList = Arrays.asList(arrayOfstr);
        List<String> upperstrList = strList.stream()
            .map(String::toUpperCase)
            .peek(System.out::println)
            .collect(Collectors.toList());
        System.out.println(upperstrList);
        assertIterableEquals(
            Arrays.asList("JAVA", "PYTHON", "SWIFT", "GO", "PHP"),
            upperstrList
        );
    }
    
    @Test
    public void testStreamEqualInteger() {
        Integer[] nums = {123, 564, 800};
        Integer number = Stream.of(nums)
            .filter(n -> n > 800)
            .findFirst().orElse(null);
        assertNull(number);
    }

    @Test
    public void testIntStreamSum() {
        int[] nums = {1, 6, 10, 3};
        int sum = IntStream.of(nums)
            .sum();
        assertEquals(20, sum);
    }

}

package nivell2.exercici4test;

import org.example.nivell2.exercici4.module.MixedDataProcessor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MixedDataProcessorTest {

    private MixedDataProcessor processor;
    private List<String> input;

    @BeforeEach
    void setup() {
        processor = new MixedDataProcessor();
        input = Arrays.asList("apple", "123", "banana", "45", "elephant", "true", "cake", "Zoo");
    }

    @Test
    void givenMixedData_whenSortedByFirstCharacter_thenSortedCorrectly() {
        List<String> result = processor.sortByFirstCharacter(input);

        assertEquals("123", result.get(0)); // Expected numeric at the top
        assertTrue(result.indexOf("Zoo") < result.indexOf("apple"));
    }

    @Test
    void givenMixedData_whenSortedWithEPriority_thenEStringsComeFirst() {
        List<String> result = processor.sortWithEPriority(input);

        assertTrue(result.indexOf("elephant") < result.indexOf("banana"));
        assertTrue(result.indexOf("cake") < result.indexOf("banana")); // 'cake' also has 'e'
    }

    @Test
    void givenMixedData_whenReplacedAWith4_thenStringsHaveReplacements() {
        List<String> result = processor.replaceAWith4(input);

        assertTrue(result.contains("4pple"));
        assertTrue(result.contains("b4n4n4"));
        assertTrue(result.contains("c4ke"));
    }

    @Test
    void givenMixedData_whenFilteredNumericStrings_thenOnlyNumbersRemain() {
        List<String> result = processor.filterNumericStrings(input);

        assertEquals(List.of("123", "45"), result);
    }
}
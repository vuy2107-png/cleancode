package fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void testFizz() {
        String result = FizzBuzz.fizzBuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    void testBuzz() {
        String result = FizzBuzz.fizzBuzz(5);
        assertEquals("Buzz", result);
    }

    @Test
    void testFizzBuzz() {
        String result = FizzBuzz.fizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    void testNormalNumber() {
        String result = FizzBuzz.fizzBuzz(7);
        assertEquals("7", result);
    }
}

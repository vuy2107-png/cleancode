import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NextDayCalculatorTest {

    @Test
    @DisplayName("1/1/2018 -> 2/1/2018")
    void testDay1Month1Year2018() {
        String result = NextDayCalculator.getNextDay(1, 1, 2018);
        assertEquals("2/1/2018", result);
    }

    @Test
    @DisplayName("31/1/2018 -> 1/2/2018")
    void testDay31Month1Year2018() {
        String result = NextDayCalculator.getNextDay(31, 1, 2018);
        assertEquals("1/2/2018", result);
    }

    @Test
    @DisplayName("30/4/2018 -> 1/5/2018")
    void testDay30Month4Year2018() {
        String result = NextDayCalculator.getNextDay(30, 4, 2018);
        assertEquals("1/5/2018", result);
    }

    @Test
    @DisplayName("28/2/2018 -> 1/3/2018")
    void testDay28Month2Year2018() {
        String result = NextDayCalculator.getNextDay(28, 2, 2018);
        assertEquals("1/3/2018", result);
    }

    @Test
    @DisplayName("29/2/2020 -> 1/3/2020")
    void testDay29Month2Year2020() {
        String result = NextDayCalculator.getNextDay(29, 2, 2020);
        assertEquals("1/3/2020", result);
    }

    @Test
    @DisplayName("31/12/2018 -> 1/1/2019")
    void testDay31Month12Year2018() {
        String result = NextDayCalculator.getNextDay(31, 12, 2018);
        assertEquals("1/1/2019", result);
    }
}

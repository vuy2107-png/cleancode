import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleClassifierTest {

    @Test
    @DisplayName("2, 2, 2 → tam giác đều")
    void testEquilateralTriangle() {
        String result = TriangleClassifier.classifyTriangle(2, 2, 2);
        assertEquals("tam giác đều", result);
    }

    @Test
    @DisplayName("2, 2, 3 → tam giác cân")
    void testIsoscelesTriangle() {
        String result = TriangleClassifier.classifyTriangle(2, 2, 3);
        assertEquals("tam giác cân", result);
    }

    @Test
    @DisplayName("3, 4, 5 → tam giác thường")
    void testNormalTriangle() {
        String result = TriangleClassifier.classifyTriangle(3, 4, 5);
        assertEquals("tam giác thường", result);
    }

    @Test
    @DisplayName("8, 2, 3 → không phải là tam giác")
    void testNotTriangle1() {
        String result = TriangleClassifier.classifyTriangle(8, 2, 3);
        assertEquals("không phải là tam giác", result);
    }

    @Test
    @DisplayName("-1, 2, 1 → không phải là tam giác")
    void testNotTriangle2() {
        String result = TriangleClassifier.classifyTriangle(-1, 2, 1);
        assertEquals("không phải là tam giác", result);
    }

    @Test
    @DisplayName("0, 1, 1 → không phải là tam giác")
    void testNotTriangle3() {
        String result = TriangleClassifier.classifyTriangle(0, 1, 1);
        assertEquals("không phải là tam giác", result);
    }
}

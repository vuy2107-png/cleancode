package cylinder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {

    @Test
    public void testGetVolume() {
        int radius = 2;
        int height = 5;
        double expected = (2 * Math.PI * radius) * height + 2 * (Math.PI * radius * radius);
        double result = Cylinder.getVolume(radius, height);
        assertEquals(expected, result, 0.0001);
    }
}


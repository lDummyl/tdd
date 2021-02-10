package users.homework.codetotest;

import junit.framework.TestCase;
import org.junit.Test;

public class NewtonInterpolatorTest extends TestCase {
    private final NewtonInterpolator interpolator = new NewtonInterpolator();

    @Test
    public void testGetY() {
        interpolator.points.add(new Point(-10, 30));
        interpolator.points.add(new Point(0, 0));
        interpolator.points.add(new Point(10, 30));

        double resultY = interpolator.getY(5);
        assertEquals(7, resultY,0.5);
    }
}
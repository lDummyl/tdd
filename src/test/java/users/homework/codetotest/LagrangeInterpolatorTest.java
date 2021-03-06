package users.homework.codetotest;

import org.junit.Test;

import static org.junit.Assert.*;

public class LagrangeInterpolatorTest {
    private final LagrangeInterpolator interpolator = new LagrangeInterpolator();

    @Test
    public void getY_quadratic_function_1() {
        interpolator.points.add(new Point(-10, 30));
        interpolator.points.add(new Point(0, 0));
        interpolator.points.add(new Point(10, 30));

        double resultY = interpolator.getY(5);
        assertEquals(7, resultY,0.5);
    }
}
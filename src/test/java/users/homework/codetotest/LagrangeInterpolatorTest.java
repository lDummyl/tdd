package users.homework.codetotest;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;



public class LagrangeInterpolatorTest {

    @Test
    public void getY_quadratic_function_1() {
        LagrangeInterpolator lagrangeInterpolator = new LagrangeInterpolator();
        lagrangeInterpolator.points.add(new Point(-5, 25));
        lagrangeInterpolator.points.add(new Point(0, 0));
        lagrangeInterpolator.points.add(new Point(5, 25));
        double resultY = lagrangeInterpolator.getY(4);
        assertEquals(16, resultY,0.5);
    }

    @Test
    public void getY_quadratic_function_2() {
        LagrangeInterpolator lagrangeInterpolator = new LagrangeInterpolator();

        lagrangeInterpolator.points.add(new Point( -27.5f, (float) Math.pow(-27.5, 2)));
        lagrangeInterpolator.points.add(new Point(-0.5f, (float) Math.pow(-0.5, 2)));
        lagrangeInterpolator.points.add(new Point(13.7f, (float) Math.pow(13.7, 2)));
        double resultY = lagrangeInterpolator.getY(5.75f);
        assertEquals(Math.pow(5.75, 2), resultY,0.5);
    }
}

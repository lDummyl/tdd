package users.homework.codetotest;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static org.junit.Assert.*;
import static users.homework.codetotest.PointsCreator.getPoints;

public class LagrangeInterpolatorTest {

    LagrangeInterpolator lagrangeInterpolator = new LagrangeInterpolator();

    @Test
    public void getYTest() {
        Function <Float, Float> function = x -> (float) Math.pow(x, 2);
        ArrayList<Point> points = getPoints(function, -10, 10, 0.5f);
        for(int x = 0; x < 3; x++) {
            lagrangeInterpolator.points.add(points.get(x));
        }
        for (Point p : points) {
            float y = lagrangeInterpolator.getY(p.x);
            System.out.println("expected: " + p.y + ", actual: " + y);
            assertEquals(p.y, y, 0.5);
        }
    }
}
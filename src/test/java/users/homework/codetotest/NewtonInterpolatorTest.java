package users.homework.codetotest;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static users.homework.codetotest.PointsCreator.getPoints;

public class NewtonInterpolatorTest extends TestCase {

    NewtonInterpolator newtonInterpolator = new NewtonInterpolator();

    public void testGetY() {
        Function<Float, Float> function =  x -> (float) Math.pow(x, 2);
        ArrayList<Point> points = getPoints(function, -10, 10, 0.5f);
        for(int x = 0; x < 3; x++) {
            newtonInterpolator.points.add(points.get(x));
        }
        for (Point p : points) {
            float y = newtonInterpolator.getY(p.x);
            System.out.println("expected: " + p.y + ", actual: " + y);
            assertEquals(p.y, y, 0.5);
        }
    }
}
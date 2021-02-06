package users.homework.codetotest;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewtonInterpolatorTest {

    @Test
    public void newtonInterpolatorTest() {
        NewtonInterpolator newtonInterpolator = new NewtonInterpolator();

            newtonInterpolator.points.add(new Point( -27.5f, (float) Math.pow(-27.5, 2)));
            newtonInterpolator.points.add(new Point(-0.5f, (float) Math.pow(-0.5, 2)));
            newtonInterpolator.points.add(new Point(13.7f, (float) Math.pow(13.7, 2)));

            for (float x = -20f; x<=20f; x+=0.1f) {
                double resultY = newtonInterpolator.getY(x);
                assertEquals(Math.pow(x, 2), resultY,0.5);

            }
        }

}
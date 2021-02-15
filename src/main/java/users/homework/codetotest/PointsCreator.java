package users.homework.codetotest;

import java.util.ArrayList;
import java.util.function.Function;

public class PointsCreator {
    public static ArrayList<Point> getPoints(Function<Float, Float> function, float floor, float ceiling, float step) {

        ArrayList<Point> points = new ArrayList<>();

        for (float x = floor; x < ceiling; x = x + step) {

            Float y = function.apply(x);
            //(float) (Math.sqrt(Math.cos(31.5) / Math.log(x + 0,3f)) + Math.pow(x, 5));
            points.add(new Point(x,y));
        }
        return points;
    }
}

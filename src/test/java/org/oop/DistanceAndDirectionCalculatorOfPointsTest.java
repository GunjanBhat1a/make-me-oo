package org.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DistanceAndDirectionCalculatorOfPointsTest {

    @Test
    void twoPointsWithSameXAndYCoordinatesShouldHaveADistanceOfZero() {
        Point origin = new Point(0, 0);

        double distance = origin.distanceBetween(origin);

        Assertions.assertEquals(0, distance);
    }

    @Test
    void distanceBetweenOriginAndPointsOnUnitCircleShouldBeOne() {
        Point origin = new Point(0, 0);

        Point point1 = new Point(1, 0);

        double distance1 = point1.distanceBetween(origin);

        Assertions.assertEquals(1, distance1);

        Point point2 = new Point(0, 1);

        double distance2 = point2.distanceBetween(origin);

        Assertions.assertEquals(1, distance2);
    }

    @Test
    void distanceBetweenTwoOppositePointsOnUnitCircleShouldBeTwo() {
        Point point1 = new Point(1, 0);

        Point point2 = new Point(-1, 0);

        double distance = point1.distanceBetween(point2);

        Assertions.assertEquals(2, distance);
    }

    @Test
    void originAndPointOnPostiveXAxisShouldBeZeroRadiansAway() {
        Point origin = new Point(0, 0);

        Point point1 = new Point(1, 0);

        double direction1 = point1.directionOf(origin);

        Assertions.assertEquals(0, direction1);

        Point point2 = new Point(3, 0);

        double direction2 = point2.directionOf(origin);

        Assertions.assertEquals(0, direction2);
    }

    @Test
    void originAndPointOnNegativeXAxisShouldBePiRadiansAway() {
        Point origin = new Point(0, 0);

        Point point1 = new Point(-1, 0);

        double direction1 = point1.directionOf(origin);

        Assertions.assertEquals(Math.PI, direction1);

        Point point2 = new Point(-3, 0);

        double direction2 = point2.directionOf(origin);

        Assertions.assertEquals(Math.PI, direction2);
    }

    @Test
    void originAndPointOnYAxisShouldBeHalfPiRadiansAway() {
        Point origin = new Point(0, 0);

        Point point1 = new Point(0, 1);

        double direction1 = point1.directionOf(origin);

        Assertions.assertEquals(Math.PI / 2, direction1);

        Point point2 = new Point(0, 3);

        double direction2 = point2.directionOf(origin);

        Assertions.assertEquals(Math.PI / 2, direction2);
    }
}

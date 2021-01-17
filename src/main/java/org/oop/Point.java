package org.oop;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private double xDifference(Point from) {
        return this.x - from.x;
    }

    private double yDifference(Point from) {
        return this.y - from.y;
    }

    public double distanceBetween(Point from) {
        return Math.sqrt(Math.pow(xDifference(from), 2) + Math.pow(yDifference(from), 2));
    }

    public double directionOf(Point from) {
        return Math.atan2(yDifference(from), xDifference(from));
    }
}

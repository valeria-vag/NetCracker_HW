package com.netcracker.part1;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    private final static double EPS = 0.00001;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return "Triangle [" +
                "v1 = " + v1 +
                ", v2 = " + v2 +
                ", v3 = " + v3 +
                ']';
    }

    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        double dist1 = v1.distance(v2);
        double dist2 = v1.distance(v3);
        double dist3 = v2.distance(v3);


        if ((Math.abs(dist1 - dist2) < EPS) && (Math.abs(dist2 - dist3) < EPS) &&
                (Math.abs(dist1 - dist3) < EPS)) {
            return " is equilateral";
        }
        if ((Math.abs(dist1 - dist2) < EPS) || (Math.abs(dist2 - dist3) < EPS) ||
                (Math.abs(dist1 - dist3) < EPS)) {
            return " is isosceles";
        } else
            return " is scalene";
    }
}

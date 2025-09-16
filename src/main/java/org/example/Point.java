package org.example;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }


    public double distance() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }


    public double distance(Point point) {
        if (point == null) {
            System.out.println("Point null geldi");
            return 0;
        }
        return Math.sqrt((this.x - point.x) * (this.x - point.x) +
                (this.y - point.y) * (this.y - point.y));
    }


    public double distance(int a, int b) {
        return Math.sqrt((this.x - a) * (this.x - a) +
                (this.y - b) * (this.y - b));
    }
}

package ru.qa.sandbox;

public class Point {
    public double x;
    public double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p2) {
        return Math.sqrt(Math.pow((this.x - p2.x), 2) + Math.pow((this.y - p2.y), 2));
    }
}

class Second {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        String msg = String.format("Расстояние между двумя точками с координатами %s %s и %s %s равно %s",
                p1.x, p1.y, p2.x, p2.y, p1.distance(p2));
        System.out.println(msg);
    }
}


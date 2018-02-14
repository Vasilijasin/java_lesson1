package ru.qa.sandbox;

import static ru.qa.sandbox.HelloWorld.hello;

class HelloWorld {

    public static void main(String[] args) {
       // String somebody =  "world";
        hello("world");
        hello("user");
        hello("Maks");

        Square s =  new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());
/*        double l = 8;
        double s = l * l;
        System.out.println("Площадь квадрата со стороной " + l + " = " + s);*/
    }
    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }
    public static double area (Square s){
        return s.l * s.l;
    }
    public static double area(Rectangle r){
        return r.a * r.b;
    }
}
package ru.qa.sandbox;

import static ru.qa.sandbox.HelloWorld.hello;

class HelloWorld {

    public static void main(String[] args) {
       // String somebody =  "world";
        hello("world");
        hello("user");
        hello("Maks");

        double l = 5;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со сторонами " + a + " и " + b + " = " + area(a, b));
/*        double l = 8;
        double s = l * l;
        System.out.println("Площадь квадрата со стороной " + l + " = " + s);*/
    }
    public static void hello(String somebody){
        System.out.println("Hello, " + somebody + "!");
    }
    public static double area (double len){
        return len* len;
    }
    public static double area(double a, double b){
        return a * b;
    }
}   
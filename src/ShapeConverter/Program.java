package ShapeConverter;

import java.util.Scanner;
import java.lang.Math.*;

abstract class Shape {
    double width;
    abstract void area();
}

class Square extends Shape{
    public Square(int x) {
        this.width = x;
    }
    public void area(){
//        area of square = a^2;
//        a = height/with of the square *note:squares with and height id always same
        width = width*width;
        System.out.println(width);
    }
}

class Circle extends Shape{
    public Circle(int x) {
        this.width = x;
    }

    public void area(){
        width = Math.PI;
    }
}


public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}

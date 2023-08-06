package shnayder_evgeny.shapes_main;

import shnayder_evgeny.shapes.Circle;
import shnayder_evgeny.shapes.Rectangle;
import shnayder_evgeny.shapes.Square;
import shnayder_evgeny.shapes.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Square square1 = new Square(4.5);

        System.out.println(square1);
        System.out.println("Ширина квадрата равна: " + square1.getWidth());
        System.out.println("Высота квадрата равна: " + square1.getHeight());
        System.out.println("Площадь квадрата равна: " + square1.getArea());
        System.out.println("Периметр квадрата равен: " + square1.getPerimeter());

        Triangle triangle1 = new Triangle(1.1, 1.1, 4.1, 1.1, 5.1, 4.1);

        System.out.println(triangle1);
        System.out.println("Ширина треугольника равна: " + triangle1.getWidth());
        System.out.println("Высота треугольника равна: " + triangle1.getHeight());
        System.out.println("Площадь треугольника равна: " + triangle1.getArea());
        System.out.println("Периметр треугольника равен: " + triangle1.getPerimeter());

        Rectangle rectangle1 = new Rectangle(4, 5);

        System.out.println(rectangle1);
        System.out.println("Ширина прямоугольника равна: " + rectangle1.getWidth());
        System.out.println("Высота прямоугольника равна: " + rectangle1.getHeight());
        System.out.println("Площадь прямоугольника равна: " + rectangle1.getArea());
        System.out.println("Периметр прямоугольника равен: " + rectangle1.getPerimeter());

        Circle circle1 = new Circle(5);

        System.out.println(circle1);
        System.out.println("Ширина круга равна: " + circle1.getWidth());
        System.out.println("Высота круга равна: " + circle1.getHeight());
        System.out.println("Площадь круга равна: " + circle1.getArea());
        System.out.println("Периметр круга равен: " + circle1.getPerimeter());
    }
}
package shnayder_evgeny.shapes_main;

import shnayder_evgeny.shapes.*;
import shnayder_evgeny.shapes_comparators.AreaComparator;
import shnayder_evgeny.shapes_comparators.PerimeterComparator;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Square square1 = new Square(4.5);

        System.out.println(square1);
        System.out.println("Ширина квадрата равна: " + square1.getWidth());
        System.out.println("Высота квадрата равна: " + square1.getHeight());
        System.out.println("Площадь квадрата равна: " + square1.getArea());
        System.out.println("Периметр квадрата равен: " + square1.getPerimeter());

        Triangle triangle1 = new Triangle(1.1, 1.1, 4.1, 1.1, 5.1, 4.1);

        triangle1.setX1(1);
        triangle1.setY1(1);
        triangle1.setX2(4);
        triangle1.setY2(1);
        triangle1.setX3(5);
        triangle1.setY3(4);

        System.out.println(triangle1);
        System.out.println("Ширина треугольника равна: " + triangle1.getWidth());
        System.out.println("Высота треугольника равна: " + triangle1.getHeight());
        System.out.println("Площадь треугольника равна: " + triangle1.getArea());
        System.out.println("Периметр треугольника равен: " + triangle1.getPerimeter());

        Rectangle rectangle1 = new Rectangle(4.2, 5.1);

        rectangle1.setWight(4);
        rectangle1.setHeight(5);

        System.out.println(rectangle1);
        System.out.println("Ширина прямоугольника равна: " + rectangle1.getWidth());
        System.out.println("Высота прямоугольника равна: " + rectangle1.getHeight());
        System.out.println("Площадь прямоугольника равна: " + rectangle1.getArea());
        System.out.println("Периметр прямоугольника равен: " + rectangle1.getPerimeter());

        Circle circle1 = new Circle(5);

        circle1.setRadius(5.1);

        System.out.println(circle1);
        System.out.println("Ширина круга равна: " + circle1.getWidth());
        System.out.println("Высота круга равна: " + circle1.getHeight());
        System.out.println("Площадь круга равна: " + circle1.getArea());
        System.out.println("Периметр круга равен: " + circle1.getPerimeter());

        Shape[] shapes = {new Circle(6),
                new Rectangle(2, 10),
                new Circle(7),
                new Triangle(1, 1, 8, 1, 8, 6),
                new Square(9)
        };

        System.out.println("Фигура с максимальной площадью: " + getMaxAreaShape(shapes));
        System.out.println("Вторая по величине периметра фигура: " + getSecondLargestPerimeterShape(shapes));
    }

    public static Shape getMaxAreaShape(Shape[] shapes) {
        if (shapes.length < 1) {
            return null;
        }

        Arrays.sort(shapes, new AreaComparator());

        return shapes[shapes.length - 1];
    }

    public static Shape getSecondLargestPerimeterShape(Shape[] shapes) {
        if (shapes.length < 2) {
            return null;
        }

        Arrays.sort(shapes, new PerimeterComparator());

        return shapes[shapes.length - 2];
    }
}

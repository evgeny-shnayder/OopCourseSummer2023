package evgeny_shnayder.range_main;

import evgeny_shnayder.range.Range;

public class Main {
    public static void main(String[] args) {
        Range range1 = new Range(2, 5);
        Range range2 = new Range(4.9, 5.5);

        System.out.println("Интервал пересечения: " + range1.getIntersection(range2));
    }
}
package shnayder_evgeny.shapes;

public class Rectangle implements Shape {
    private  double wight;
    private double height;

    public Rectangle(double wight, double height) {
        this.wight = wight;
        this.height = height;
    }
    @Override
    public double getWidth() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    @Override
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * wight;
    }

    @Override
    public double getPerimeter() {
        return (height + wight) * 2;
    }

    @Override
    public String toString() {
        return "Прямоугольник высотой: " + height + ", шириной: " + wight + ".";
    }

    @Override
    public int hashCode() {
        int prime = 37;
        int hash = 1;

        hash = prime * hash + Double.hashCode(height);
        hash = prime * hash + Double.hashCode(wight);

        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }

        if (object == null || object.getClass() != getClass()) {
            return false;
        }

        Rectangle rectangle = (Rectangle) object;

        return rectangle.wight == wight && rectangle.height == height;
    }
}

package p4_inheritance;

class Box {

    protected double length, breadth;

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

class Box3D extends Box {

    private double height;

    public Box3D(double l, double b, double h) {
        super(l, b);
        this.height = h;
    }

    public double volume() {
        return length * breadth * height;
    }
}

public class BoxMain {

    public static void main(String[] args) {

        Box3D b = new Box3D(10, 5, 2);

        System.out.println("Area = " + b.area());
        System.out.println("Volume = " + b.volume());
    }
}

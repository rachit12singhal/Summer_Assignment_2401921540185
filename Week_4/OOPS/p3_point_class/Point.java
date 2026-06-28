package p3_point_class;

class Point {

    private int x, y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {

        Point p = new Point(10, 20);
        p.display();
    }
}

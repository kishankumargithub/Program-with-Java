abstract class Geometry {
    abstract void rectangle_area(int h, int w);
    abstract void triangle_area(int b, int h);
    abstract void circle_area(double r);
    abstract void square_area(int s);

    final void rectangle_perimeter(int h, int w) {
        int perimeter = 2 * (h + w);
        System.out.println("Perimeter of rectangle is " + perimeter);
    }
}

class Easy extends Geometry {
    void rectangle_area(int h, int w) {
        System.out.println("Area of rectangle is " + h * w);
    }

    void triangle_area(int b, int h) {
        System.out.println("Area of triangle is " + (b * h) / 2);
    }

    void circle_area(double r) {
        System.out.println("Area of circle is " + 3.14 * r * r);
    }

    void square_area(int s) {
        System.out.println("Area of square is " + s * s);
    }
}

public class FinalAbMethod {
    public static void main(String[] args) {
        Easy e = new Easy();
        e.rectangle_area(5, 10);
        e.triangle_area(10, 5);
        e.circle_area(5);
        e.square_area(5);
        e.rectangle_perimeter(5, 10); // This line will now work correctly
    }
}

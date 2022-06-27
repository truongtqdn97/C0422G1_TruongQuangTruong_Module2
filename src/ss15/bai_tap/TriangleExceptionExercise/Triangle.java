package ss15.bai_tap.TriangleExceptionExercise;

public class Triangle {
    double a, b, c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Side must be higher than 0");
        } else if (a + b < c || a + c < b || b + c < a) {
            throw new IllegalTriangleException("Not a triangle");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}

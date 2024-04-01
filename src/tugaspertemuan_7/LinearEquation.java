package tugaspertemuan_7;

public class LinearEquation {
    private double a, b, c, d, e, f;
    
    public LinearEquation() {
        this.a = 1;
        this.b = 1;
        this.c = 1;
        this.d = 1;
        this.e = 1;
        this.f = 1;
    }

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - c * e) / (a * d - b * c);
    }
}

package zxf.java.pattern.factorymethod.staticmethod;

public class Complex {
    private double real;
    private double imaginary;

    private Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public static Complex fromCartesianFactory(double real, double imaginary) {
        return new Complex(real, imaginary);
    }

    public static Complex fromPolarFactory(double modulus, double angle) {
        return new Complex(modulus * Math.cos(angle), modulus * Math.sin(angle));
    }
}

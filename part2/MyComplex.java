package com.netcracker.part2;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    private final static double EPS = 0.00001;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if (imag < 0) {
            return "(" + real + imag + "i)";
        }
        return "(" + real + " + " + imag + "i)";

    }

    public boolean isReal() {
        if (real != 0) {
            return true;
        }
        return false;
    }

    public boolean isImaginary() {
        if (imag != 0) {
            return true;
        }
        return false;
    }

    public boolean equals(double real, double imag) {
        if (Math.abs(this.real - real) < EPS &&
                Math.abs(this.imag - imag) < EPS)
            return true;
        return false;
    }

    public boolean equals(MyComplex another) {
        if (Math.abs(this.real - another.real) < EPS &&
                Math.abs(this.imag - another.imag) < EPS)
            return true;
        return false;
    }

    public double magnitude() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double argument() {
        return Math.toRadians(Math.atan2(real, imag));
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += +right.imag;
        return this;

    }

    public MyComplex addNew(MyComplex right) {
        double newReal = this.real + right.real;
        double newImag = this.imag + right.imag;
        return new MyComplex(newReal, newImag);

    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag = this.imag - right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        double newReal = this.real - right.real;
        double newImag = this.imag - right.imag;
        return new MyComplex(newReal, newImag);
    }

    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.real - this.imag * right.imag;
        this.imag = this.real * right.imag + right.real * this.imag;
        return this;
    }

    //?
    public MyComplex divide(MyComplex right) {
        double newReal = (real * right.real + imag * right.imag) /
                (right.real * right.real + right.imag * right.imag);
        double newImag = (imag * right.real - real * right.imag) /
                (right.real * right.real + right.imag * right.imag);

        return new MyComplex(newReal, newImag);
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, (-1) * this.imag);

    }
}

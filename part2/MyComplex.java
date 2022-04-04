package com.netcracker.part2;

import java.util.Objects;

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
        return "(" + real + (imag >= 0 ? '+' : "") + imag + 'i' + ")";
    }

    public boolean isReal() {
        return (real != 0);
    }

    public boolean isImaginary() {
        return (imag != 0);
    }

    public boolean equals(double real, double imag) {
        return (Math.abs(this.real - real) < EPS &&
                Math.abs(this.imag - imag) < EPS);
    }

    public boolean equals(MyComplex another) {
        return (Math.abs(this.real - another.real) < EPS &&
                Math.abs(this.imag - another.imag) < EPS);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.real, real) == 0 &&
                Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }
}

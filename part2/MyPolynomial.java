package com.netcracker.part2;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    //@Override
    public String toString() {
        String polynomOut = "";
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] == 0)
                continue;
            if (i > 1) {
                polynomOut = polynomOut + coeffs[i] + " * x^" + i;
                polynomOut += " + ";
            }
            if (i == 1) {
                polynomOut = polynomOut + coeffs[i] + " * x";
                polynomOut += " + ";
            }
            if (i == 0)
                polynomOut += coeffs[i];
        }
        return polynomOut;
    }

    public double evaluate(double x) {
        double res = 0;
        int n = coeffs.length - 1;
        for (double coeff : coeffs) {
            res += coeff * Math.pow(x, n);
            n--;
        }
        return res;
    }

    public MyPolynomial add(MyPolynomial right) {
        MyPolynomial polynomial = this;
        if (polynomial.getDegree() < right.getDegree()) {
            polynomial = right;
        }
        double[] pCoeffs = polynomial.coeffs;
        double[] rCoeffs = right.coeffs;
        for (int i = 0; i < pCoeffs.length; i++) {
            if (i > rCoeffs.length - 1) {
                continue;
            }
            pCoeffs[i] += rCoeffs[i];
        }
        return new MyPolynomial(pCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial right) {
        double coef[] = new double[right.getDegree() + this.getDegree() + 1];
        for (int i = 0; i < coef.length; i++)
            coef[i] = 0;
        for (int i = this.getDegree(); i >= 0; i--)
            for (int j = right.getDegree(); j >= 0; j--)
                coef[i + j] += this.coeffs[i] * right.coeffs[j];
        return new MyPolynomial(coef);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPolynomial that = (MyPolynomial) o;
        return Arrays.equals(coeffs, that.coeffs);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(coeffs);
    }
}

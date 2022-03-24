package com.netcracker.part2;

public class Main {
    public static void main(String[] args) {
        myComplexTest();
        myPolynomialTest();
        containerTest();
    }

    //переделать
    public static void myComplexTest(){
        System.out.println("Complex Test:");
        MyComplex expr1 = new MyComplex(7,15);
        MyComplex expr2 = new MyComplex(6, 3);

        System.out.println("Complex1 = " + expr1);
        System.out.println("Complex2 = " + expr2);

        System.out.println(expr1 + " + " + expr2 +
                " = " + expr1.addNew(expr2));
        System.out.println(expr1 + " - " + expr2 +
                " = " + expr1.subtractNew(expr2));

        MyComplex newExpr = new MyComplex(expr1.getReal(), expr1.getImag());

        System.out.println(newExpr + " * " + expr2 +
                " = " + newExpr.multiply(expr2));

        newExpr = new MyComplex(expr1.getReal(), expr1.getImag());
        System.out.println( newExpr + " / " + expr2 +
                " = " + expr1.divide(expr2));

        System.out.println("======================================");
    };

    public static void myPolynomialTest(){
        System.out.println("Polynom Test:");

        MyPolynomial polynom1 = new MyPolynomial(new double[]{5, 7, 0, 8, 0, 4});
        MyPolynomial polynom2 = new MyPolynomial(new double[]{9, 3, 0, 0});

        System.out.println("Polinom1 " + polynom1);
        System.out.println("Degree of polinom1 = " + polynom1.getDegree());

        System.out.println("Polinom2 " + polynom2);
        System.out.println("Degree of polinom1 = " + polynom2.getDegree());



        System.out.println("======================================");
    };


    public static void containerTest(){
        System.out.println("Container Test:");
        Container container = new Container(0,0, 10, 10);
        Ball ball1 = new Ball(2.9f,2.9f,3,2,45);
        Ball ball2 = new Ball(5.0f,5.0f,1,0,0);

        System.out.println(container);
        System.out.println(ball1);
        System.out.println("Ball1 in the container is " + container.collides(ball1));
        System.out.println(ball2);
        System.out.println("Ball2 in the container is " + container.collides(ball2));
        ball1.move();
        System.out.println("Ball1 has moved");
        System.out.println(ball1);
        System.out.println("Ball1 in the container is " + container.collides(ball1));

    };
}

package com.netcracker.part1;

public class Main {
    public static void main(String[] args) {
        circleTest();
        rectangleTest();
        employeeTest();
        bookTest();
        myPointTest();
        myTriangleTest();
    }

    public static void circleTest() {
        System.out.println("Circle Test:");

        Circle circle = new Circle();
        Circle circle1 = new Circle(20);
        Circle circle2 = new Circle(13, "yellow");

        System.out.println("Color of circle is " + circle1.getColor());
        System.out.println("Color of circle2 is " + circle2.getColor());

        circle1.setColor("purple");
        System.out.println("New color of circle is " + circle1.getColor());

        System.out.println("Radius of circle2 = " + circle2.getRadius());

        circle2.setRadius(17);
        System.out.println("New radius of circle2 = " + circle2.getRadius());

        System.out.println("Circle: " + circle + ", Aria = " + circle.getArea());
        System.out.println("Circle1: " + circle1 + ", Aria = " + circle1.getArea());
        System.out.println("Circle:2 " + circle2 + ", Aria = " + circle2.getArea());

        System.out.println("======================================");
    }

    public static void rectangleTest() {
        System.out.println("Rectangle Test:");

        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(7, 15);

        System.out.println(rectangle);
        rectangle.setLength(9);
        rectangle.setWidth(13);
        System.out.println("New: " + rectangle);
        System.out.println("Length = " + rectangle.getLength() + ", " +
                "Width = " + rectangle.getWidth());
        System.out.println("Perimeter = " + rectangle1.getPerimeter());
        System.out.println("Area = " + rectangle1.getArea());

        System.out.println(rectangle1);
        rectangle1.setLength(3);
        rectangle1.setWidth(5);
        System.out.println("New: " + rectangle1);
        System.out.println("Perimeter = " + rectangle1.getPerimeter());
        System.out.println("Area = " + rectangle1.getArea());

        System.out.println("======================================");
    }

    public static void employeeTest() {
        System.out.println("Employee Test:");

        Employee employee = new Employee(1, "Gerard", "Pique", 2330000);

        System.out.println(employee);
        System.out.println("Name: " + employee.getName());

        System.out.println("Salary = " + employee.getSalary() + " $");
        System.out.println("New salary = " + employee.raiseSalary(10) + " $");

        System.out.println("Annual salary = " + employee.getAnnualSalary() + " $");
        System.out.println("New annual salary = " + employee.getAnnualSalary() + " $");

        System.out.println("======================================");
    }

    public static void bookTest() {
        System.out.println("Book Test:");

        Book book = new Book("The Da Vinci Code", new Author[]{new Author("Dan Brown", "danbrown@gmail.com", 'M')},
                1950);
        Book book1 = new Book("Children's fairy tales",
                new Author[]{new Author("Jacob Grimm", " - ", 'M'),
                        new Author("Wilhelm Grimm", "", 'M')},
                2600);

        System.out.println(book);
        System.out.println("Name of book: " + book.getName());
        System.out.println("Price = " + book.getPrice() + " руб.");
        book.setPrice(2100);
        System.out.println("New price = " + book.getPrice() + " руб.");

        System.out.println(book1);
        System.out.println("Name of book1: " + book1.getName());
        System.out.println("Price = " + book1.getPrice() + " руб.");

        System.out.println("======================================");
    }

    public static void myPointTest() {
        System.out.println("MyPoint Test:");

        MyPoint point1 = new MyPoint(0, 0);
        MyPoint point2 = new MyPoint(5, 3);
        MyPoint point3 = new MyPoint(-7, 4);

        System.out.println("Point1 = " + point1);
        point1.setXY(2, 2);
        System.out.println("New point1 = " + point1);

        System.out.println("Point2 = " + point2);
        point2.setY(7);
        System.out.println("New point2 = " + point2);

        System.out.println("Point3 = " + point3);

        System.out.println("Distance12 = " + point1.distance(point2));
        System.out.println("Distance12 = " + point1.distance(point2.getX(), point2.getY()));
        System.out.println("Distance13 = " + point1.distance(point3));

        System.out.println("======================================");
    }

    public static void myTriangleTest() {
        System.out.println("MyTriangle Test:");

        MyTriangle triangle1 = new MyTriangle(0, 3, -2, -3, -6, 1);
        MyTriangle triangle2 = new MyTriangle(new MyPoint(3, 5),
                new MyPoint(1, 2), new MyPoint(2, 7));

        System.out.println(triangle1);
        System.out.println("Perimeter = " + triangle1.getPerimeter());
        System.out.println("Triangle" + triangle1.getType());

        System.out.println(triangle2);
        System.out.println("Perimeter = " + triangle2.getPerimeter());
        System.out.println("Triangle" + triangle2.getType());

        System.out.println("======================================");
    }
}

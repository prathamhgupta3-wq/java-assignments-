import java.util.Scanner;

abstract class Figure {

    abstract void findArea();
    abstract void findPerimeter();

    void showMessage() {
        System.out.println("\nFigure has been created. Choose an operation.");
    }
}


// ---------------- CIRCLE ----------------

class Circle extends Figure {

    double r;

    Circle(double r) {
        this.r = r;
        super.showMessage();
    }

    void findArea() {
        System.out.println("Circle area : " + 3.14 * r * r);
    }

    void findPerimeter() {
        System.out.println("Circle perimeter : " + 2 * 3.14 * r);
    }
}


// ---------------- SQUARE ----------------

class Square extends Figure {

    double s;

    Square(double s) {
        this.s = s;
        super.showMessage();
    }

    void findArea() {
        System.out.println("Square area : " + s * s);
    }

    void findPerimeter() {
        System.out.println("Square perimeter : " + 2 * s);
    }
}


// ---------------- RECTANGLE ----------------

class Rectangle extends Figure {

    double l;
    double b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
        super.showMessage();
    }

    void findArea() {
        System.out.println("Rectangle area : " + l * b);
    }

    void findPerimeter() {
        System.out.println("Rectangle perimeter : " + 2 * (l + b));
    }
}


// ---------------- TRIANGLE ----------------

class Triangle extends Figure {

    double b;
    double h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
        super.showMessage();
    }

    void findArea() {
        System.out.println("Triangle area : " + 0.5 * b * h);
    }

    void findPerimeter() {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangle:");

        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Triangle perimeter : "
                + (side1 + side2 + side3));
    }
}


// ---------------- CYLINDER ----------------

class Cylinder extends Figure {

    double r;
    double h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
        super.showMessage();
    }

    void findArea() {
        System.out.println("Cylinder area : "
                + (2 * 3.14 * r * h + 2 * 3.14 * r * r));
    }

    void findPerimeter() {
        System.out.println("Cylinder perimeter : "
                + 2 * 3.14 * r);
    }

    // Extra method only available in Cylinder
    void findVolume() {
        System.out.println("Cylinder volume : "
                + h * r * r * 3.14 * 2);
    }
}


// ---------------- MAIN CLASS ----------------

public class Assi5_ai {

    public static void main(String[] args) {

        Figure f = new Circle(2806);

        f.findArea();
        f.findPerimeter();

        System.out.println();


        Figure f1 = new Square(2806);

        f1.findArea();
        f1.findPerimeter();

        System.out.println();


        Figure f2 = new Rectangle(2806, 2806);

        f2.findArea();
        f2.findPerimeter();

        System.out.println();


        Figure f3 = new Triangle(2806, 2806);

        f3.findArea();
        f3.findPerimeter();

        System.out.println();


        // Parent reference pointing to Cylinder object
        Figure f4 = new Cylinder(2806, 2806);

        f4.findArea();
        f4.findPerimeter();

        // Cannot directly call findVolume()
        // because Figure does not contain this method.

        ((Cylinder) f4).findVolume();


        // Downcasting using a separate child reference
        Cylinder cy = (Cylinder) f4;

        cy.findVolume();

        System.out.println();


        // Direct reference of child class
        Cylinder f5 = new Cylinder(2806, 2806);

        f5.findArea();
        f5.findPerimeter();
        f5.findVolume();

        System.out.println();
    }
}

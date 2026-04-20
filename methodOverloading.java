// ✨ (i) Method OverloadingJava
class Shape {

    // Parallelepiped
    double volume(double l, double b, double h) {
        return l * b * h;
    }

    double surfaceArea(double l, double b, double h) {
        return 2 * (l*b + l*h + b*h);
    }

    // Cylinder
    double volume(double r, double h) {
        return Math.PI * r * r * h;
    }

    double surfaceArea(double r, double h) {
        return 2 * Math.PI * r * (r + h);
    }

    // Sphere
    double volume(double r) {
        return (4.0/3) * Math.PI * r * r * r;
    }

    double surfaceArea(double r) {
        return 4 * Math.PI * r * r;
    }
}

public class ShapeOverloadingDemo {
    public static void main(String[] args) {

        Shape s = new Shape();

        System.out.println("Parallelepiped Volume: " + s.volume(2,3,4));
        System.out.println("Parallelepiped Surface Area: " + s.surfaceArea(2,3,4));

        System.out.println("Cylinder Volume: " + s.volume(3,5));
        System.out.println("Cylinder Surface Area: " + s.surfaceArea(3,5));

        System.out.println("Sphere Volume: " + s.volume(3));
        System.out.println("Sphere Surface Area: " + s.surfaceArea(3));
    }
}
// ✨ (ii) Inheritance ApproachJava
class Shape {
    void display() {
        System.out.println("Shape class");
    }
}

// Parallelepiped
class Parallelepiped extends Shape {
    double l, b, h;

    Parallelepiped(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    double volume() {
        return l * b * h;
    }

    double surfaceArea() {
        return 2 * (l*b + l*h + b*h);
    }
}

// Cylinder
class Cylinder extends Shape {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double volume() {
        return Math.PI * r * r * h;
    }

    double surfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }
}

// Sphere
class Sphere extends Shape {
    double r;

    Sphere(double r) {
        this.r = r;
    }

    double volume() {
        return (4.0/3) * Math.PI * r * r * r;
    }

    double surfaceArea() {
        return 4 * Math.PI * r * r;
    }
}

// Main
public class ShapeInheritanceDemo {
    public static void main(String[] args) {

        Parallelepiped p = new Parallelepiped(2,3,4);
        Cylinder c = new Cylinder(3,5);
        Sphere s = new Sphere(3);

        System.out.println("Parallelepiped Volume: " + p.volume());
        System.out.println("Surface Area: " + p.surfaceArea());

        System.out.println("\nCylinder Volume: " + c.volume());
        System.out.println("Surface Area: " + c.surfaceArea());

        System.out.println("\nSphere Volume: " + s.volume());
        System.out.println("Surface Area: " + s.surfaceArea());
    }
}
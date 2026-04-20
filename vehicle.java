import java.util.Scanner;

// Base class
class Vehicle {
    protected String licence_number;
    protected int speed;
    protected String color;
    protected String owner_name;

    Vehicle(String ln, int s, String c, String owner) {
        licence_number = ln;
        speed = s;
        color = c;
        owner_name = owner;
    }

    void showdata() {
        System.out.println("\nThis is a vehicle class");
        System.out.println("Licence Number: " + licence_number);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + owner_name);
    }
}

// Bus class
class Bus extends Vehicle {
    private int route_no;

    Bus(String ln, int s, String c, String owner, int route) {
        super(ln, s, c, owner);
        route_no = route;
    }

    void showdata() {
        super.showdata();
        System.out.println("Route Number: " + route_no);
        System.out.println("This is a Bus class");
    }
}

// Car class
class Car extends Vehicle {
    private String manufacturer_name;

    Car(String ln, int s, String c, String owner, String manufacturer) {
        super(ln, s, c, owner);
        manufacturer_name = manufacturer;
    }

    void showdata() {
        super.showdata();
        System.out.println("Manufacturer Name: " + manufacturer_name);
        System.out.println("This is a Car class");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for Bus
        System.out.println("Enter Bus Details:");
        System.out.print("Licence Number: ");
        String bln = sc.nextLine();

        System.out.print("Speed: ");
        int bspeed = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Color: ");
        String bcolor = sc.nextLine();

        System.out.print("Owner Name: ");
        String bowner = sc.nextLine();

        System.out.print("Route Number: ");
        int route = sc.nextInt();
        sc.nextLine();

        Bus bus = new Bus(bln, bspeed, bcolor, bowner, route);

        // Input for Car
        System.out.println("\nEnter Car Details:");
        System.out.print("Licence Number: ");
        String cln = sc.nextLine();

        System.out.print("Speed: ");
        int cspeed = sc.nextInt();
        sc.nextLine();

        System.out.print("Color: ");
        String ccolor = sc.nextLine();

        System.out.print("Owner Name: ");
        String cowner = sc.nextLine();

        System.out.print("Manufacturer Name: ");
        String manufacturer = sc.nextLine();

        Car car = new Car(cln, cspeed, ccolor, cowner, manufacturer);

        // Display data
        System.out.println("\n--- Bus Details ---");
        bus.showdata();

        System.out.println("\n--- Car Details ---");
        car.showdata();

        sc.close();
    }
}
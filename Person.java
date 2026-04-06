public class Person {

    // Private instance variables
    private String name;
    private int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Non-static inner class
    class Address {
        private String city;
        private int pinCode;

        // Constructor for Address
        public Address(String city, int pinCode) {
            this.city = city;
            this.pinCode = pinCode;
        }

        // Method to display full details
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("City: " + city);
            System.out.println("Pin Code: " + pinCode);
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create Person object
        Person p = new Person("Shibam", 21);

        // Create Address object using inner class
        Person.Address addr = p.new Address("Kolkata", 700001);

        // Display details
        addr.displayDetails();
    }
}
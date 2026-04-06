public class Average {

    // Method using varargs
    public void calculate(double... numbers) {

        double sum = 0;
        int count = 0;

        // Loop through values
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            count++;
        }

        // Calculate average
        if (count > 0) {
            double avg = sum / count;
            System.out.println("Average = " + avg);
        } else {
            System.out.println("No values provided");
        }
    }

    // Main method
    public static void main(String[] args) {

        Average obj = new Average();

        // Different sets of values
        obj.calculate(10, 20, 30);
        obj.calculate(5.5, 6.5);
        obj.calculate(100);
        obj.calculate(); // no arguments case
    }
}
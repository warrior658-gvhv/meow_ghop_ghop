public class CountAndPrintArgs {

    public static void main(String[] args) {

        int count = 0;        // manual counter
        String result = "";   // to store first letters

        // Loop through arguments
        for (int i = 0; i < args.length; i++) {
            count++;  // manually increment count

            if (args[i].length() > 0) {
                result = result + args[i].charAt(0);
            }
        }

        // Print result
        System.out.println("No. of arguments - " + count + " " + result);
    }
}
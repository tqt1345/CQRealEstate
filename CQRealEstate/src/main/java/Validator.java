import java.util.Scanner;
public class Validator {
    // requestValidInt requests and validates an integer
    public static int requestValidInt(String prompt, int min, int max) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        boolean isValid = false; // Flag to break loop

        // Continues to request input until valid
        while (!isValid) {
            System.out.println(prompt);
            if (input.hasNextInt()) { // Checks if input is an integer
                num = input.nextInt();
                if (num > min) { // Checks if number is greater than minimum needed
                    if (num < max) { // Checks if number is less than maximum needed
                        isValid = true; // Breaks the loop if all conditions are met
                    } else {
                        System.out.println("Invalid input, must be less than: " + max);
                    }
                } else {
                    System.out.println("Invalid input, must be greater than: " + min);
                }
            } else {
                System.out.println("Invalid input, must be an integer");
                input.next(); // Prevents infinite loop
            }
        }
        return num;
    }

    // Overloaded requestValidInt method that only requires minimum value argument
    public static int requestValidInt(String prompt, int min) {
        return requestValidInt(prompt, min, Integer.MAX_VALUE);
    }
    // requestValidDouble requests and validates a double
    public static double requestValidDouble(String prompt, double min, double max) {
        Scanner input = new Scanner(System.in);
        double num = 0;
        boolean isValid = false; // Flag to break loop

        // Continues to request input until valid
        while (!isValid) {
            System.out.println(prompt);
            if (input.hasNextDouble()) { // Checks if input is a double
                num = input.nextDouble();
                if (num > min) { // Checks if number is greater than minimum needed
                    isValid = true; // Breaks the loop if all conditions are met
                } else {
                    System.out.println("Invalid input, must be greater than: " + min);
                }
            } else {
                System.out.println("Invalid input, must be a double");
                input.next(); // Prevents infinite loop
            }
        }
        return num;
    }

    // Overloaded requestValidDouble method that only requires minimum value argument
    public static double requestValidDouble(String prompt, double min) {
        return requestValidDouble(prompt, min, Double.MAX_VALUE);
    }

    public static String requestValidString (String prompt, String type, int min, int max) {
        /*
        Type argument accepts only the following as String:
        - name
        - address
        - phone
        This is used to modify how this method validates the input
         */

        // Get input
        Scanner input = new Scanner(System.in);
        String string = "";
        boolean isValid = false;

        // Continues to request input until valid
        while (!isValid) {
            System.out.println(prompt);
            if (input.hasNextLine()) {
                string = input.nextLine();
                if (string.length() > 0)
                {
                    switch (type) { // Checks for different types of input based on "type" argument
                        case "name": // Checks if input is a name
                            if (string.matches("[a-zA-Z]+")) { // Regex to check for letters only
                                if (string.length() > min) {
                                    isValid = true;
                                } else {
                                    System.out.println("Invalid input, must be greater than " + min + " characters");
                                    break;
                                }
                            } else {
                                System.out.println("Invalid input, no numbers, special characters, or spaces");
                                break;
                            } continue;
                        case "address": // Checks if input is an address
                            if (string.length() > min) {
                                isValid = true;
                            } else {
                                System.out.println("Invalid input, must be greater than " + min + " characters");
                                break;
                            } continue;
                        case "phone": // Checks if input is a phone number
                            if (string.matches("[0-9]+")) { // Regex to check for numbers only
                                if (string.length() == min) {
                                    isValid = true;
                                } else {
                                    System.out.println("Invalid input, must be " + min + " digits");
                                    break;
                                }
                            } else {
                                System.out.println("Invalid input, no letters, special characters, or spaces");
                                break;
                            }
                    }
                } else {
                    System.out.println("Invalid input, must be greater than 0 characters");
                }
            } else {
                System.out.println("Invalid input, must be a string");
            }
        }
        return string;
    }

    // Overloaded requestValidString method that only requires minimum value argument
    public static String requestValidString(String prompt, String type, int min) {
        return requestValidString(prompt, type, min, Integer.MAX_VALUE);
    }

    // requestValidString requests and validates a string
    public static String requestValidStringRedundant(String prompt, int min) {
        Scanner input = new Scanner(System.in);
        String string = "";
        boolean isValid = false;

        // Continues to request input until valid
        while (!isValid) {
            System.out.println(prompt);
            if (input.hasNextLine()) { // Checks if input is a string
                string = input.nextLine();
                if (string.length() > 0) { // Checks if input is greater than 0 characters
                    isValid = true; // Breaks the loop if all conditions are met
                } else {
                    System.out.println("Invalid input, must be greater than: " + min + " characters");
                }
            } else {
                System.out.println("Invalid input, must be a string");
                input.next(); // Prevents infinite loop
            }
        }
        return string;
    }
}


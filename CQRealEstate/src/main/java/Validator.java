import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
                    if (num < max) { // Checks if number is less than maximum needed
                        isValid = true; // Breaks the loop if all conditions are met
                    } else {
                        System.out.println("Invalid input, must be less than: " + max);
                    }
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

    // requestValidString requests and validates a string
    public static String requestValidString (String prompt, String type, int min) {
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


    // requestValidDate requests, validates and converts a date into a String
    public static String requestValidDate () {

        Scanner input = new Scanner(System.in);
        LocalDate date = null;
        String formattedDate = "";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Boolean isValid = false;

        // Continues to request date until valid
        while (!isValid) {
            System.out.println("Enter a date in the format (dd/mm/yyyy)");
            try { // Will assign date if input is valid
                date = LocalDate.parse(input.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy")); //
                formattedDate = date.format(formatter); // Format the date into a string
                isValid = true;
            } catch (Exception e) { // Error message is displayed when input is invalid
                System.out.println("Invalid input, must be in the format: (dd/mm/yyyy)");
            }
        }
        return formattedDate;
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


import java.util.Scanner;
public class Validator {
    // requestValidInt requests and validates an integer
    public static int requestValidInt(String prompt, int min) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        boolean isValid = false; // Flag to break loop

        // Continues to request input until valid
        while (!isValid) {
            System.out.println(prompt);
            if (input.hasNextInt()) { // Checks if input is an integer
                num = input.nextInt();
                if (num > min) { // Checks if number is greater than minimum needed
                    isValid = true; // Breaks the loop if all conditions are met
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
    // requestValidDouble requests and validates a double
    public static double requestValidDouble(String prompt, double min) {
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

    public static String requestValidString (String prompt, String type, int min) {
        Scanner input = new Scanner(System.in);
        String string = "";
        boolean isValid = false;

        while (!isValid) {
            System.out.println(prompt);
            if (input.hasNextLine()) {
                string = input.nextLine();
                if (string.length() > 0)
                {
                    switch (type) {
                        case "name":
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
                        case "address":
                            if (string.length() > min) {
                                isValid = true;
                            } else {
                                System.out.println("Invalid input, must be greater than " + min + " characters");
                                break;
                            } continue;
                        case "phone":
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


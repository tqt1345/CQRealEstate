import java.io.IOException;

public class Util {

    // Prompts the user to press enter to continue the program
    public static void awaitInput(){
        System.out.println("Press enter to continue");
        try { // Tries to wait for user input
            System.in.read();
        } catch (IOException e) { // Catches any errors
            e.printStackTrace();
        }
    }

    // Clears the console
    public static void clearConsole() {
        System.out.print("\033[H\033[2J"); // An ANSI escape sequence to clear the console
        System.out.flush(); //
    }

    // Waits for input, then clears the console. Used to separate display output for different parts of program
    public static void moveOn() {
        System.out.println();
        awaitInput();
        clearConsole();
    }

    // Prints a separator line
    public static String separator(int count) {
        return ("*" + "~".repeat(count) + "*");
    }
}

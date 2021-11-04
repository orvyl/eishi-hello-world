package dcup.eishi;

import java.util.Scanner;

public class Application {
    /**
     * Maglagay ng pangalan
     * idisplay ang panagalan with greetings
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name: ");
        var name = scanner.nextLine();

        System.out.println("Hello, World! Did you know that your name is " + name);

        System.out.print("How much do you want to withdraw: ");
        var amount = scanner.nextLine();

        if (Integer.parseInt(amount) > 100) {
            System.out.println("Insufficient balance. Sad :(");
        } else {
            System.out.println("Sure!");
        }
    }

}

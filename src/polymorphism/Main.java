package polymorphism;

import java.util.Locale;

import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Enter number 1: ");
        double x = scanner.nextDouble();
        System.out.print("Enter number 2: ");
        double y = scanner.nextDouble();

        DivController controller = new DivController();

        controller.runApp(x, y);
        
    }
}

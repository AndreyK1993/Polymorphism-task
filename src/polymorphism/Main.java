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

        Div DivA=new DivA(x,y);
        Div DivB=new DivB(x,y);

        double resultA = DivA.calcResult();
        double resultB = DivB.calcResult();

        String roundResultA = Rounder.roundValue(resultA);
        String roundResultB = Rounder.roundValue(resultB);


        System.out.println("Result from Device A: " + roundResultA +
                "\nResult from Device B: " + roundResultB);

    }
}

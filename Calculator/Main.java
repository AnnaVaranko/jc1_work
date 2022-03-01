package Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String command = "C";
        while (command.equals("C")) {
            Scanner scanner = new Scanner(System.in);

            Arguments arguments = readArguments();
            doCanculation(arguments);
            command = scanner.next();
        }
    }

    private static Arguments readArguments(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Pleas enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Pleas enter operation: ");
        String operation = scanner.next();

        System.out.print("Pleas enter first number: ");
        int secondNumber = scanner.nextInt();

        return new Arguments(firstNumber, operation, secondNumber);
    }

    private static void doCanculation(Arguments arguments){
        final double result =
                calc.calculate(firstNumber, secondNumber, operation.charAt(0));
        System.out.println("Result of " + firstNumber + " " + operation.charAt(0) + " " + secondNumber
                + " is " + result);
        System.out.print("Pleas enter [C] to continue or [E] to exit ");
    }
}

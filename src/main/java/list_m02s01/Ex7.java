package list_m02s01;

import java.util.Scanner;

public class Ex7 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insert a first number: ");
        float x = input.nextFloat();

        System.out.println("Insert a second number: ");
        float y = input.nextFloat();

        System.out.println("Insert the desired operation's number: 1 - SUM, 2- SUBTRACTION, 3- MULTIPLICATION OR 4 -DIVISION");
        int operation = input.nextInt();

        switch (operation) {
            case 1 -> {
                float resultSum = x + y;
                System.out.println("The final result is " + resultSum);
            }
            case 2 -> {
                float resultSub = x - y;
                System.out.println("The final result is " + resultSub);
            }
            case 3 -> {
                float resultMulti = x * y;
                System.out.println("The final result is " + resultMulti);
            }
            case 4 -> {
                float resultDiv = x / y;
                System.out.printf("The final result is %.2f", resultDiv);
            }
            default -> System.out.println("Did you insert one of the four operations?");
        }
    }
}

package list_m02s01;

import java.util.Scanner;

public class Ex2 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insert your height (e.g.: 1,50)");
        double height = input.nextDouble();

        System.out.println("Insert your weight (e.g.: 65,5)");
        double weight = input.nextDouble();

        double imc = weight / (Math.pow(height, 2));

        System.out.printf("Your IMC is: %.2f ", imc);


    }
}

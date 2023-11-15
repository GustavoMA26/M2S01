package list_m02s01;

import java.util.Scanner;

public class Ex9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What's the employee salary?");
        double salary = input.nextDouble();
        double salaryFinal;

        if( salary <= 1200 ) {
            salaryFinal = salary * 1.20;
        } else if( salary > 1200 && salary < 1700 ) {
            salaryFinal = salary * 1.15;
        } else if( salary > 1700 && salary < 2500 ) {
            salaryFinal = salary * 1.10;
        } else {
            salaryFinal = salary * 1.05;
        }
        System.out.printf("Old salary: %.2f", salary);
        System.out.println();
        System.out.printf("Value increased: %.2f", salaryFinal - salary);
        System.out.println();
        System.out.printf("New salary: %.2f", salaryFinal);
    }

}

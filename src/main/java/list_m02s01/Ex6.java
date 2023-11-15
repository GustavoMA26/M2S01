package list_m02s01;

import java.util.Scanner;


public class Ex6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insert your birth year");
        int year = input.nextInt();

        int age = 2023 - year;

        if(age < 16 ) {
            System.out.printf("With %d yo is forbidden to vote in Brazil", age);
        } else if (age >= 18 && age <= 59) {
            System.out.printf("With %d yo you must vote in Brazil", age);
        } else {
            System.out.printf("With %d yo is up to you to vote in Brazil", age);
        }
    }
}

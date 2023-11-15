package list_m02s01;

import java.util.Scanner;

public class Ex3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insert an integer number: ");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("It's an even number!");
        } else {
            System.out.println("It's an odd number!");
        }
    }
}

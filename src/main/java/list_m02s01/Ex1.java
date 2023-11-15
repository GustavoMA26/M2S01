package list_m02s01;

import java.util.Scanner;

public class Ex1 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insert your name: ");
        String name = input.nextLine();

        System.out.println("Insert your surname: ");
        String surname = input.nextLine();

        System.out.println("Your full name is " + name + " " + surname + " and your first name has " + name.length() + " letters");
    }
}

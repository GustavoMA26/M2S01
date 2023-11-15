package list_m02s01;

import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insert your 1st semester's grade: ");
        float grade1 = input.nextFloat();
        System.out.println("Insert your 2nd semester's grade: ");
        float grade2 = input.nextFloat();
        System.out.println("Insert your 3rd semester's grade: ");
        float grade3 = input.nextFloat();

        float avgGrade = (grade1+grade2+grade3) / 3;

        System.out.printf("Your final semester's grade is: %.2f ", avgGrade);



    }
}

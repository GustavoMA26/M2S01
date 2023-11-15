package list_m02s01;

import java.util.Objects;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insert an initial value: ");
        int initialValue = input.nextInt();

        System.out.println("Insert a common difference: ");
        int difference = input.nextInt();

        System.out.println("Do you want to calculate a Arithmetic or Geometric Progression? Insert A or G");
        char progressionType = input.next().charAt(0);

        int nthTerm = 10;
        int i = 1;
        if(progressionType == 'A') {
            while (i <= nthTerm) {
                int result = initialValue + (i - 1) * difference;
                i++;
                System.out.println(result);
            }
        } else if(progressionType == 'G') {
            while (i <= nthTerm) {
                double result = initialValue * (Math.pow(difference, i - 1));
                i++;
                System.out.println(result);
            }
        }


    }
}

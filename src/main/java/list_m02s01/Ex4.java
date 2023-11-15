package list_m02s01;

import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberGuess;
        int randomNumber = (int)(Math.random() * (6-1) + 1);
        System.out.println(randomNumber);
        System.out.println("Guess a number between 1 and 5: ");


        do {
            numberGuess = input.nextInt();
            if(numberGuess == randomNumber) {
                System.out.println("You got it right!");
            } else {
                System.out.println("Ops, that's not the right number. Try again:");
            }

        } while (numberGuess != randomNumber);



    }
}

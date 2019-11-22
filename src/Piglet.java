//11.22 Charly. This program should be able to roll dices until you get a one.
import java.util.Scanner;

public class Piglet {

    public static String game() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Piglet! Please type your number in \"Yes\" or \"No\"");
        int result = 0;
        String answer = "yes";
        while (answer.equals("yes")) {
            int eachRoll = (int) (Math.random() * 6)+1;
            if (eachRoll == 1) {
                result = 0;
                System.out.println("You rolled a 1!");
                answer = "no";
                return "You got 0 points.";
            } else {
                result += eachRoll;
                System.out.println("You rolled a " + eachRoll + "!");
                System.out.println("Roll again?");
                answer = input.next();
            }
        }
        return "You got " + result + " points.";
    }
    public static void main(String[] args){
        System.out.println(game());
    }
}

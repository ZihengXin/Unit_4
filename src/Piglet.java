import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int initial = (int) (Math.random() * 6);
        while (initial > 1) {
            System.out.println("Welcome to Piglet !");
        }
    }
}

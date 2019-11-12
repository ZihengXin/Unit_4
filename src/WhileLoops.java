// 11.12. Charly. This program contains multiple methods.
import java.util.Scanner;
public class WhileLoops {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        countPosAndNeg();
    }
    public static void fromHereToThere() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a small number: ");
        int startNum = input.nextInt();
        System.out.print("Enter a large number: ");
        int endNum = input.nextInt();
        String result;
        int value = startNum;
        if (startNum >= endNum)
            result = "Invalid input";
        else
            while (value <= endNum) {
                System.out.print(value + " ");
                value++;
            }
    }
    public static void factors() {
        System.out.print("Enter number X: ");
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int initial = 1;
        System.out.println("The factors of " + X + " are: ");
        while (initial <= X) {
            if (X % initial == 0)
                System.out.print(initial + " ");
            initial ++;
        }
    }
    public static void countPosAndNeg(){
        Scanner input = new Scanner(System.in);
        int value = 1;
        int positive = 0;
        int negative = 0;
        if (value > 0)
        while ((value > 0)||(value < 0))
        {
            System.out.print("Enter a positive or negative number or 0 to quit: ");
            value = input.nextInt();
            if (value < 0)
                negative ++;
            if (value > 0)
                positive ++;
        }
        System.out.print("There were "+positive+" positive and "+negative+" negative numbers.");
    }
}

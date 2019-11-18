// 11.12. Charly. This program contains multiple methods.
import java.util.Scanner;
public class WhileLoops {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print(factors(12));
    }
    public static String fromHereToThere(int startNum, int endNum) {
        int value = startNum;
        String result = "";
        if (startNum >= endNum)
            return "Invalid input";
        else
            while (value <= endNum) {
                result = value + " ";
                value++;
            }
            return result;
    }
    public static String factors(int X) {
        int initial = 1;
        String outcome = "";
        while (initial <= X) {
            if (X % initial == 0)
                outcome += initial + " ";
            initial ++;
        }
        return "The factors of " + X + " are: "+outcome;
    }
    public static String countPosAndNeg(){
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
        return "There were "+positive+" positive and "+negative+" negative numbers.";
    }
    public static String findMinAndMax(){
        Scanner input = new Scanner(System.in);
        int times = 0;
        int max = -999999999;
        int min = 999999999;
        while (times < 5){
            System.out.print("Number: ");
            int value = input.nextInt();
            if (value > max)
                max = value;
            if (value < min)
                min = value;
            times++;
        }
        return "Max value is: "+max + "\nMin value is: "+min;
    }
    public static double gradePoint(){
        Scanner input = new Scanner(System.in);
        int times = 0;
        /* A = 4.0;
           B = 3.0;
           C = 2.0;
           D = 1.0;
           F = 0.0; */
        System.out.println("Enter seven letter grades (A, B, C, D, or F)");
        double totalScore = 0.0;
        while (times < 7){
            String grade = input.next();
            if (grade.equals("A"))
                totalScore += 4.0;
            else if (grade.equals("B"))
                totalScore += 3.0;
            else if (grade.equals("C"))
                totalScore += 2.0;
            else if (grade.equals("D"))
                totalScore += 1.0;
            else if (grade.equals("F"))
                totalScore += 0;
            times ++;
        }
        double average = (int)(totalScore*100/7+0.5);
        double gpa = average/100;
        return gpa;
    }
}

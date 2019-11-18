// 11.12. Charly. This program contains multiple methods.
import java.util.Scanner;
public class WhileLoops {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
    }
    public static String fromHereToThere(int startNum, int endNum) {
        int value = startNum;
        String result = "";
        if (startNum > endNum)
            return "Invalid input";
        else
            while (value <= endNum) {
                result += value + " ";
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
        int times = 0;
        String grade = "";
        /* A = 4.0;
           B = 3.0;
           C = 2.0;
           D = 1.0;
           F = 0.0; */
        System.out.println("Enter seven letter grades (A, B, C, D, or F)");
        double Score = 0;
        double gpa = 0;
        while (times < 7){
            grade = input.next();
            if (grade.equals("A"))
                Score = 4.0;
            else if (grade.equals("B"))
                Score = 3.0;
            else if (grade.equals("C"))
                Score = 2.0;
            else if (grade.equals("D"))
                Score = 1.0;
            else //grade.equals("F")
                Score = 0;
            gpa += Score;
            times ++;
        }
        double average = (int)(gpa*100/7+0.5);
        double outcome = average/100;
        return outcome;
    }
}

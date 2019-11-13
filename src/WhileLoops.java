// 11.12. Charly. This program contains multiple methods.
import java.util.Scanner;
public class WhileLoops {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        gradePoint();
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
    public static void findMinAndMax(){
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
        System.out.println("Max value is: "+max);
        System.out.print("Min value is: "+min);
    }
    public static void gradePoint(){
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
        System.out.print("GPA = "+gpa);
    }
}

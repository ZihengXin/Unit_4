// 11/19 Charly. For loops exercised. This program includes multiple methods for the test.
import java.util.Scanner;

public class ForLoops {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
    }
    public static String printingHashTags(int num){
        String result = "";
        for (int times = 1; times<=num; times++){
            result+="#";
        }
        return result;
    }
    public static String countDown(int one, int two){
        String result = "";
        if (one<two){
            for(int num = two; num >=one; num--)
                result += num + " ";

            }
        else if (one == two)
            result = String.valueOf(two)+" ";
        else
            result = "";
        return result;
    }
    public static String countDown2(int one, int two){
        String result = "";
        if (one<two){
            for(int num = two; num >=one; num--){
                result += num + " ";
            }}
        else if (one>two){
            for(int num = one; num >=two; num--){
                result += num + " ";
            }}
        else
            result = String.valueOf(two)+" ";
        return result;
    }
    public static int sumNumbers(int one, int two){
        int output = 0;
        if (one < two){
            for (int value = one; value <= two; value++){
                output += value;
            } }
        else if (one > two){
            for (int value = two; value <= one; value++){
                output += value;
            } }
        else if (one == two){
            output = one;
        }
        else
            output = 0;
        return output;
    }
}

// 11/19 Charly. For loops exercised. This program includes multiple methods for the test. 
import java.util.Scanner;

public class ForLoops {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
    }
    public static String printingHashTags(int num){
        String result = "";
        for (int times = 1; times<num; times++){
            result+="#";
        }
        return result;
    }
    public static String countDown(int one, int two){
        String result = "";
        if (one<two)
            for(int num = two; num > one; num--){
                result += num;
            }
        else
            result = "";
        return result;
    }
}

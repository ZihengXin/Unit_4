//12.4 Charly. This program should be able to pass through the NestedLoopsTest.
import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

    }
    public static String xSquare(){
        String str = "";
        for (int a = 1; a<6; a++){
            for (int b = 1; b<6; b++){
                str +="X";
            }
            str += "\n";
        }
        return str;
    }
    public static String xSquare2(int n){
        String str = "";
        for (int a = 1; a<= n; a++){
            for (int b = 1; b<= n; b++){
                str +="X";
            }
            str += "\n";
        }
        return str;
    }
    public static String flippedTriangle(int n){
        String str = "";
        for (int a = 1; a <= n; a++){
            for (int b = n-a+1; b >= 1; b--){
                str += "*";
            }
            str += "\n";
        }
        return str;
    }
    public static String multiplicationTable(){
        String str = "";
        for (int a = 1; a <= 9; a ++){
            for (int b = 1; b <= 9; b++){
                if (b*a >= 10)
                str += " "+b*a;
                else
                    str += "  "+b*a;
            }
            str += "\n";
        }
        return str;
    }
}

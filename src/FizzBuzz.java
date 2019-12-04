// 12.4 Charly. This program should be able to print numbers in a way of number + Fizz + Buzz + FizzBuzz. 
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Max value? ");
        int user = input.nextInt();
        System.out.print(fizzBuzz(user));
    }
    public static String fizzBuzz(int num){
        String str = "";
        for (int a = 1; a <= num; a++){
            if ((a % 3 == 0)&&(a % 5 == 0)) {
                str += "FizzBuzz ";
            }
            else if (a % 5 == 0){
                str += "Buzz ";
            }
            else if (a % 3 == 0){
                str += "Fizz ";
            }
            else{
                str += a+" ";
            }
            if (a % 20 == 0)
                str += "\n";
        }
        return str;
    }
}

// 11.21 Charly. String Problems that should be able to pass the test.
public class StringProblems {
    public static String printTheLetters(String words) {
        String outcome = "";
        int length = words.length();
        for (int value = 0; value < length; value++) {
            outcome += words.substring(value, value + 1) + "\n";
        }
        return outcome;
    }

    public static String everyOtherLetter(String words) {
        String outcome = "";
        int length = words.length();
        for (int value = 0; value < length; value++) {
            if (value % 2 == 0) {
                outcome += words.substring(value, value + 1);
            }
        }
        return outcome;
    }
    public static int countTheVowels(String words){
        int outcome = 0;
        String rawData = words.toLowerCase();
        int length = words.length();
        for (int value = 0; value < length; value ++){
            String letter = words.substring(value,value+1);
            if ((letter.equals("a"))||(letter.equals("e"))||(letter.equals("i"))||(letter.equals("o"))
                    ||(letter.equals("u"))||(letter.equals("A"))||(letter.equals("E"))
                    ||(letter.equals("I"))||(letter.equals("O"))||(letter.equals("U")))
                outcome++; }
        return outcome;
    }
    public static String differentStrings(String s1, String s2){
        int difference = 0;
        int lengthOne = s1.length();
        int lengthTwo = s2.length();
        String result = "";
        if (lengthOne > lengthTwo) {
            for (int value = 0; value < s2.length(); value++) {
                if (s2.substring(value, value + 1).equals(s1.substring(value, value + 1))) {
                    difference = value + 2;
                } else {
                    difference = value + 1;
                    break;
                }
            }
            result = s1+" and "+s2+ "are not the same. They differ at letter number "+difference+".";
        }
        else if (lengthOne < lengthTwo){
            for (int value = 0; value < s1.length(); value++) {
                if (s1.substring(value, value + 1).equals(s2.substring(value, value + 1))) {
                    difference = value + 2;
                } else {
                    difference = value + 1;
                    break;
                }
            }
            result = s1+" and "+s2+ " are not the same. They differ at letter number "+difference;
        }
        else
            result = s1+" and "+s2+" are the same";
        return result;
    }
    public static boolean isPalindrome(String s){
        boolean result = false;
        for (int value = 0; value < s.length(); value++) {
            if (s.substring(value, value + 1).equals(s.substring((s.length() - value-1), s.length() - value)))
                result = true;
        }
        return result;
    }
}
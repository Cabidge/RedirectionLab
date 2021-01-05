import java.util.*;

public class PigLatin {
    public static void main(String[] aaa) {
        System.out.print(PigLatin.pigLatinSimple("mock"));
        System.out.println(" = ockmay?");
        
        System.out.print(PigLatin.pigLatinSimple("pie"));
        System.out.println(" = iepay?");

        System.out.print(PigLatin.pigLatinSimple("david"));
        System.out.println(" = avidday?");

        System.out.print(PigLatin.pigLatinSimple("aaron"));
        System.out.println(" = aaronhay?");
    }

    public static String pigLatinSimple(String s) {
        s = s.toLowerCase();

        char firstChar = s.charAt(0);
        if (PigLatin.lowerIsVowel(firstChar)) {
            return s + "hay";
        } else {
            return s.substring(1) + firstChar + "ay";
        }
    }
    
    public static boolean lowerIsVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
}
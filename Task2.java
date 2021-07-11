import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Arrays;

public class Task2 {
    /**
     * Given an array (arr) as an argument complete the function countSmileys
     * that should return the total number of smiling faces.
     *
     * Rules for a smiling face:
     *
     * Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
     * A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
     * Every smiling face must have a smiling mouth that should be marked with either ) or D
     * No additional characters are allowed except for those mentioned.
     *
     * Valid smiley face examples: :) :D ;-D :~)
     * Invalid smiley faces: ;( :> :} :]
     *
     * Example
     * countSmileys([":)", ";(", ";}", ":-D"]);       // should return 2;
     * countSmileys([";D", ":-(", ":-)", ";~)"]);     // should return 3;
     * countSmileys([";]", ":[", ";*", ":$", ";-D"]); // should return 1;
     * Note
     * In case of an empty array return 0. You will not be tested with invalid input
     * (input will always be an array).
     * Order of the face (eyes, nose, mouth) elements will always be the same.
     */

    public static void main(String[] arg) {
        String[] arr = new String[]{":)", ":-", "x-]", ":ox", ";-(", ";~)", ":~D"};
        Task2.countSmileys(arr);
        int a=countSmileys(arr);
        System.out.println(a);
    }

    public static int countSmileys(String[] arr) {
        String eyes1 = ":";
        String eyes2 = ";";
        String smile1 = ")";
        String smile2 = "D";
        String nose1 = "-";
        String nose2 = "~";
        String nose3 = "";
        String wrongSymbol="(";
        String wrongSymbol1="*";
        String wrongSymbol2="[";

        int count = 0;
        int m;

        for(m = 0; m < arr.length; m++) {
            boolean eyes = arr[m].contains(eyes1) || arr[m].contains(eyes2);
            boolean smile = arr[m].contains(smile1) || arr[m].contains(smile2);
            boolean nose = arr[m].contains(nose1) || arr[m].contains(nose2) || arr[m].contains(nose3);
            boolean wrongSym = arr[m].contains(wrongSymbol) || arr[m].contains(wrongSymbol1) || arr[m].contains(wrongSymbol2);

            if((eyes && smile && nose == true) && (arr[m].length()==3 || arr[m].length()==2)) {
                count++;
            }
            if ((eyes || smile || nose == false) || (wrongSym==true)||(arr[m].length()>3 && arr[m].length()<2)){
                count = count;
            }
        }
        return count;
    }
}

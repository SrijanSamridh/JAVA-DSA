package DSA.strings;

import java.util.Arrays;

public class q1 {

    static String longestCommonPrefix(String[] str){
        Arrays.sort(str);
        String fstStr = str[0];
        String lstStr = str[str.length-1];
        String res = "";
        for (int i = 0; i < fstStr.length(); i++) {
            if (fstStr.charAt(i) == lstStr.charAt(i)) res+= fstStr.charAt(i);
            else break;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        String res = longestCommonPrefix(str);
        System.out.println(res);
    }
}

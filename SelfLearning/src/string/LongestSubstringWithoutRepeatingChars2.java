package string;

import java.util.Objects;
/*
https://www.youtube.com/watch?v=3IETreEybaA
 */
public class LongestSubstringWithoutRepeatingChars2 {

    private static int longestSubstringWithoutRepeatingChars(String s){
        if(Objects.isNull(s) || s.isEmpty()){
            System.out.println("String is Null/Empty");
            return 0;
        }
        int maxLength = 0;

        for(int left=0, right=0; right<s.length(); right++){
            int firstAppearanceOfChar = s.indexOf(s.charAt(right), left);

            if(firstAppearanceOfChar != right){
                left = firstAppearanceOfChar+1;
            }
            maxLength = Math.max(maxLength, right-left +1);
        }
        return maxLength;

    }
    public static void main(String[] args){
        System.out.println("longest substring without repeating characters length: "+longestSubstringWithoutRepeatingChars("au") );
    }
}

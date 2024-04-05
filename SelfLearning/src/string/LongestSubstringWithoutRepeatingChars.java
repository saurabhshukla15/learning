package string;

import java.util.Objects;

public class LongestSubstringWithoutRepeatingChars {

    private static int longestSubstringWithoutRepeatingChars(String s){
        if(Objects.isNull(s) || s.isEmpty()){
            System.out.println("String is Null/Empty");
            return 0;
        }
        int maxLength = 0;

        for(int i=0; i<s.length(); i++){
            StringBuilder currentSubstring = new StringBuilder();
            for (int j=i; j<s.length();j++){
                if(currentSubstring.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }
                currentSubstring.append(s.charAt(j));
                maxLength = Math.max(maxLength, currentSubstring.length());
            }
        }
        return maxLength;

    }
    public static void main(String[] args){
        System.out.println("longest substring without repeating characters length: "+longestSubstringWithoutRepeatingChars("Saurabh") );
    }
}

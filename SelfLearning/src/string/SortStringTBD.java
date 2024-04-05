package string;

import java.util.Arrays;
import java.util.Objects;

public class SortStringTBD {

    private static String sortString(String sort) {
        if(Objects.isNull(sort) || sort.isBlank()){
            System.out.println("String is null");
            return null;
        }
        char[] charArray = sort.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args){
        System.out.println("Sorted String: "+sortString("saurabh"));
        System.out.println("Sorted String: "+sortString("bdca"));
    }
}

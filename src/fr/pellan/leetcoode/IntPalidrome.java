package fr.pellan.leetcoode;

import java.util.*;

public class IntPalidrome {

    public static void main (String[] args){
        //v2
        boolean result = isPalindromev3(121);
        System.out.println(result);
        result = isPalindromev3(-121);
        System.out.println(result);
        result = isPalindromev3(11);
        System.out.println(result);
        result = isPalindromev3(10);
        System.out.println(result);
    }

    public static boolean isPalindromev2(int x) {

        String value = String.valueOf(x);
        byte[] byteArray = value.getBytes();
        for(int i = 0; i <= byteArray.length/2-1; i++){
            if(byteArray[i] != byteArray[byteArray.length-1-i]){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromev3(int x) {

        if(x < 0){
            return false;
        }

        List<Integer> digits = new ArrayList<>();
        int increment = 10;
        while(x > 0){
            digits.add(x % increment);
            x = x / increment;
        }

        for(int i = 0; i <= digits.size()/2-1; i++){
            if(digits.get(i) != digits.get(digits.size()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }

        LinkedHashMap<Integer, Integer> positions = new LinkedHashMap<>();
        int increment = 10;
        int position = 0;
        while(x > 0){
            positions.put(position, x % increment);
            x = x / increment;
            if(x > 0){
                position++;
            }
        }

        int i = 0;
        while(position > i){
            if(positions.get(position) != positions.get(i)){
                return false;
            }
            i++;
            position--;
        }

        return true;
    }
}

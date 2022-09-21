package fr.pellan.leetcoode;

import java.util.HashMap;

public class RomanConvertor {

    public static void main (String[] args){

        System.out.println(convert("III"));
        System.out.println(convert("LVIII"));
        System.out.println(convert("MCMXCIV"));
    }

    public static int convert(String s) {

        HashMap<Character, Integer> values = new HashMap<>();
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);

        int count = 0;
        char previous = ' ';
        char[] chars = s.toCharArray();
        for(int i = chars.length-1; i >= 0; i--){

            if(chars[i] == previous){
                count += values.get(chars[i]);
                continue;
            }

            if(values.get(chars[i]) < count){
                count -= values.get(chars[i]);
            } else {
                count += values.get(chars[i]);
            }
            previous = chars[i];
        }

        return count;
    }
}

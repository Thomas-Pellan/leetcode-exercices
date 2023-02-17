package fr.pellan.leetcoode;

import java.util.Arrays;

public class PlusOne {

    public static void main (String[] args){

        System.out.println(Arrays.toString(plusOne(new int[] {1, 2, 0})));
        System.out.println(Arrays.toString(plusOne(new int[] {7, 8, 9})));
        System.out.println(Arrays.toString(plusOne(new int[] {9, 9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[] {8, 9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[] {1, 5, 7})));
    }

    private static int[] plusOne(int[] digits){

        if(digits[digits.length-1] != 9){
            digits[digits.length-1] = digits[digits.length-1] + 1;
            return digits;
        }

        if(digits.length == 1 && digits[0] == 9){
            return new int[]{1, 0};
        }

        int[] resultPartial = plusOne(Arrays.copyOfRange(digits, 0, digits.length -1));
        int[] result = Arrays.copyOf(resultPartial, resultPartial.length+1);
        result[resultPartial.length] = 0;

        return result;
    }
}

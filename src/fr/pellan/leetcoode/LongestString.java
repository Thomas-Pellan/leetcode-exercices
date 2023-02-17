package fr.pellan.leetcoode;

public class LongestString {

    public static void main (String[] args){

        System.out.println(longestCommonPrefix(new String[] {"flow", "flower", "flowers"}));
        System.out.println(longestCommonPrefix(new String[] {"test", "testing", "tes"}));
    }

    private static String longestCommonPrefix(String[] strs){

        StringBuilder longest = new StringBuilder("");

        char[] firstElementChars = strs[0].toCharArray();
        for(int i = 0; i < firstElementChars.length; i++){
            for(int j = 0; j < strs.length; j++){
                try {
                    if(firstElementChars[i] != strs[j].charAt(i)) {
                        return longest.toString();
                    }
                } catch (IndexOutOfBoundsException e) {
                    return longest.toString();
                }
            }
            longest.append(firstElementChars[i]);
        }

        return longest.toString();
    }
}

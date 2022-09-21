package fr.pellan.leetcoode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Parenthesis {

    public static void main (String[] args){

        System.out.println(isValid("()()()()()"));
        System.out.println(isValid("(((((())))))"));
        System.out.println(isValid("((()"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("((([[[[]]])]))"));
        System.out.println(isValid("(){}[]"));
        System.out.println(isValid("([{}]){}[]"));
    }

    private static final List<String> openings = new ArrayList<>(List.of("(", "{", "["));
    private static final List<String> closings = new ArrayList<>(List.of(")", "}", "]"));
    private static final String parenth = "()";
    private static final String brackets = "[]";
    private static final String accol = "{}";


    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        boolean isValid = true;
        for(int i = 0; i < s.length(); i++){

            String c = String.valueOf(s.charAt(i));

            isValid &= updateStack(stack, c);

            if(!isValid){
                return false;
            }
        }

        if(!stack.empty()) {
            isValid = false;
        }

        return isValid;
    }


    private static boolean updateStack(Stack stack, String entry){

        if(openings.contains(entry)){
            stack.push(entry);
            return true;
        }
        if(closings.contains(entry)){
            if(stack.empty()){
                return false;
            }
            String out = String.valueOf(stack.pop());
            if(!validateOuput(entry, out)){
                return false;
            }
        }
        return true;
    }

    private static boolean validateOuput(String entry, String stackOutput){
        if(parenth.contains(entry) && !parenth.contains(stackOutput)){
            return false;
        }
        if(brackets.contains(entry) && !brackets.contains(stackOutput)){
            return false;
        }
        if(accol.contains(entry) && !accol.contains(stackOutput)){
            return false;
        }
        return true;
    }
}

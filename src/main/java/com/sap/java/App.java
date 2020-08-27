package com.sap.java;

import java.util.Stack;

public class App
{

    public boolean validParanthesis( String expr ) {
        // [{()}]
        // expression = [{( )}]
        // if encountered with any of opening braces [ , {, ( -> push to the stack
        // check if stack is empty - if yes - return ---> symetrical
        // if encountered with any of closing braces ] , }, ) -> pop from the stack
        // check the popped out element - if it belongs to other class of braces -> return as invalid
        // check the stack size
        // if (stack size != 0) -> invalid else valid --> asymmetrical
        // expression = [{( })]
        // [ { (  ) } ] ]
        // [[ { (  ) } ]
        Stack<Character> stack = new Stack<>();
        char popChar;
        for (int i=0; i< expr.length(); i++) {
            char c = expr.charAt(i);
            if (c == '[' || c == '{' || c =='(') {
                stack.push(c);
            }
            if (stack.empty()) {
                return false;
            }
            // if can be done through switch case/dictionary also
            if (c == ']') {
                popChar = stack.peek();
                stack.pop();
                if (popChar != '[') {
                    return false;
                }
            }
            if (c == '}') {
                popChar = stack.peek();
                stack.pop();
                if (popChar != '{') {
                    return false;
                }
            }
            if (c == ')') {
                popChar = stack.peek();
                stack.pop();
                if (popChar != '(') {
                    return false;
                }
            }
        }
        return stack.empty();
        }

}

// Problem: Valid Parentheses
// Aapko ek string di gayi hai jo sirf (), {}, aur [] characters contain karti hai. Check karna hai ki string valid hai ya nahi.

// Conditions for Valid String:
// Har opening bracket ka corresponding closing bracket hona chahiye.
// Closing bracket ka order correct hona chahiye.
// Example
// Input: "({[]})"
// Output: true

// Input: "({[})"
// Output: false

package Stacks;

import java.util.Stack;

public class ValidParantheses {
    public static boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((c == '}' && top != '{') ||
                        (c == ')' && top != '(') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();

        // if(c == '('){
        // stack.push(')');
        // }
        // else if(c == '{'){
        // stack.push('}');
        // }
        // else if(c == '['){
        // stack.push(']');
        // }
        // else if(stack.isEmpty() || stack.pop() != c){
        // return false;
        // }
    }

    public static void main(String[] args) {
        String input = "({[]})";
        System.out.println("Is valid? " + isValid(input));
    }
}

package dev.mahathir.solutions;

import java.util.Stack;

public class RemoveStars_2390 {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c != '*'){
                stack.push(c);
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
        }
        return stack.stream().map(Object::toString).reduce("", String::concat);
    }
}

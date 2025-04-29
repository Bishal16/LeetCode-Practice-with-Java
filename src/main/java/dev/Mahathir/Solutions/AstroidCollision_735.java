package dev.mahathir.solutions;

import java.util.Stack;

public class AstroidCollision_735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (stack.isEmpty()) {
                stack.push(asteroids[i]);
                continue;
            }
            int top = stack.peek();
            int current = asteroids[i];

            if(oppositeDir(top, current)){
                if (Math.abs(top) < Math.abs(current)) {
                    stack.pop();
                    i--;
                }
                else if (Math.abs(top) == Math.abs(current)){
                    stack.pop();
                }
            }
            else {
                stack.push(asteroids[i]);
            }
        }
    return stack.stream().mapToInt(Integer::intValue).toArray();
    }
    boolean oppositeDir(int top, int current){
        return top > 0 && current < 0;
    }

}

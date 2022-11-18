import java.util.Stack;

public class validParentheses {

    public boolean isValid(String s) {
        boolean result = false;

        Stack<Character> stack = new Stack<>();
        if (s.length() == 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if (!stack.isEmpty() && s.charAt(i) == ')' && stack.peek() == '(') {
                result = true;
                stack.pop();
            } else if (!stack.isEmpty() && s.charAt(i) == '}' && stack.peek() == '{') {
                result = true;
                stack.pop();
            } else if (!stack.isEmpty() && s.charAt(i) == ']' && stack.peek() == '[') {
                result = true;
                stack.pop();
            }
        }

        if (stack.isEmpty()) {

            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("hello world");
        validParentheses v = new validParentheses();
        System.out.println(v.isValid("(([]){})"));
    }
}
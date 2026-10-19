/**
 * Your Name: KUBRA AYHAN
 * Your Student ID: 240444028
 * Date:26/10/2026
 */

public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        //CONTROLLİNG
        if (s == null) {
            return false;
        }

        // Create a stack
        BracketStack stack = new BracketStack();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char opening = stack.pop();
                if (!isMatchingPair(opening, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        if (opening == '(' && closing == ')') {
            return true;
        }
        if (opening == '[' && closing == ']') {
            return true;
        }
        if (opening == '{' && closing == '}') {
            return true;
        }
        return false;
    }
}
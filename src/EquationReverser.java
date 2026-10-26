public class EquationReverser {

    public static String reverseEquation(String equation) {
        TokenStack stack = new TokenStack();

        int i = 0;
        int n = equation.length();

        // TODO 1: Traverse the equation from left to right.
        while (i < n) {
            char c = equation.charAt(i);

            // TODO 2: If the current character is a digit,
            if (Character.isDigit(c)) {
                int start = i;
                while (i < n && Character.isDigit(equation.charAt(i))) {
                    i++;
                }
                String number = equation.substring(start, i);
                stack.push(number);
            }
            // TODO 3: Otherwise, push the operator.
            else {
                stack.push(String.valueOf(c));
                i++;
            }
        }

        // TODO 4: Pop all items from the stack and append
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}
class Solution {

    public static int prec(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;  // moved outside switch
    }

    public static String infixToPostfix(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                result.append(c);
            }

            else if (c == '(') {
                st.push(c);
            }

            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    result.append(st.pop());
                }
                st.pop();
            }

            else {
                while (!st.isEmpty() &&
                       prec(st.peek()) >= prec(c)) {

                    if (c == '^' && st.peek() == '^') break;

                    result.append(st.pop());
                }
                st.push(c);
            }
        }

        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.toString();
    }
}

import java.util.*;

class Solution {

    public static boolean isOp(char c){
        return c=='+' || c=='-' || c=='*' || c=='/' || c=='^';
    }

    static String preToInfix(String pre_exp) {
        Stack<String> st = new Stack<>();

        for (int i = pre_exp.length() - 1; i >= 0; i--) {

            char c = pre_exp.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                st.push(c + "");
            }
            else if (isOp(c)) {

                if (st.size() < 2) return "Invalid Expression";

                String op1 = st.pop();
                String op2 = st.pop();

                String infix = "(" + op1 + c + op2 + ")";
                st.push(infix);
            }
        }

        return st.peek();
    }
}

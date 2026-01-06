class Solution {
    public int evalRPN(String[] tokens) {
        java.util.ArrayDeque<Integer> stack = new java.util.ArrayDeque<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.equals("+")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a + b);
            } 
            else if (token.equals("-")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a - b);
            } 
            else if (token.equals("*")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a * b);
            } 
            else if (token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a / b); // truncates toward zero
            } 
            else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}

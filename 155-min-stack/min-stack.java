class MinStack {

    private java.util.ArrayDeque<Integer> stack;
    private java.util.ArrayDeque<Integer> minStack;

    public MinStack() {
        stack = new java.util.ArrayDeque<>();
        minStack = new java.util.ArrayDeque<>();
    }

    public void push(int val) {
        stack.push(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            minStack.push(Math.min(val, minStack.peek()));
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

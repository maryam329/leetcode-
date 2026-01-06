class MyQueue {

    private java.util.Stack<Integer> stackIn;
    private java.util.Stack<Integer> stackOut;

    public MyQueue() {
        stackIn = new java.util.Stack<>();
        stackOut = new java.util.Stack<>();
    }

    public void push(int x) {
        stackIn.push(x); 
    }

    public int pop() {
        moveInToOutIfNeeded();
        return stackOut.pop();
    }

    public int peek() {
        moveInToOutIfNeeded();
        return stackOut.peek();
    }

    public boolean empty() {
        return stackIn.isEmpty() && stackOut.isEmpty();
    }
    private void moveInToOutIfNeeded() {
        if (stackOut.isEmpty()) {
            while (!stackIn.isEmpty()) {
                stackOut.push(stackIn.pop());
            }
        }
    }
}

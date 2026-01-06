
class MyStack {

    private java.util.Queue<Integer> queue1;
    private java.util.Queue<Integer> queue2;

    public MyStack() {
        queue1 = new java.util.LinkedList<>();
        queue2 = new java.util.LinkedList<>();
    }

    public void push(int x) {
        queue2.offer(x); 
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll()); 
        }
        
        java.util.Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        return queue1.poll(); 
    }

    public int top() {
        return queue1.peek(); 
    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}

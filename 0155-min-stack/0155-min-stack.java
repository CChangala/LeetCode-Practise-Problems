class MinStack {

    Stack<Integer> first, minStack;


    public MinStack() {
        first = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        first.push(val);
        if(minStack.isEmpty()){
            minStack.push(val);
        }
        else if(first.peek() <= minStack.peek()){
            minStack.push(first.peek());
            } 
    }
    
    public void pop() {
        if(first.peek().equals(minStack.peek())) {
            minStack.pop();
        }
        first.pop();
    }
    
    public int top() {
        return first.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
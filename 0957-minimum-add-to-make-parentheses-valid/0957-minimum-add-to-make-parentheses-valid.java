class Solution {
    public int minAddToMakeValid(String s) {
        if(s == ""){
            return 0;
        }

        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(!stack.isEmpty()){
                if(stack.peek() == '(' && ch == ')'){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
                
            }
            else{
                    stack.push(ch);
            }
        }
        
        int count = 0;
        while(!stack.isEmpty()){
            if(stack.peek() == '(' || stack.peek() == ')'){
                System.out.println(stack.peek());
                stack.pop();
                count++;
            }
        }
        return count;    
    }
}
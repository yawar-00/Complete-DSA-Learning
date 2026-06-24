class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        stack.push('-');
        for(char c:s.toCharArray()){
            if(stack.peek()=='['&&c==']'){
                stack.pop();
            }
            else if(stack.peek()=='('&&c==')'){
                stack.pop();
            }
            else if(stack.peek()=='{'&&c=='}'){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        if(stack.peek()=='-'){
            return true;
        }
        return false;
    }
}
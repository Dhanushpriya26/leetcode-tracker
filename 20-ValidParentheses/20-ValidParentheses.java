// Last updated: 7/9/2026, 9:37:04 AM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='['||ch=='{'||ch=='('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(ch==']'&&top!='['){
                    return false;
                }
                if(ch=='}'&&top!='{'){
                    return false;
                }
                if(ch==')'&&top!='('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
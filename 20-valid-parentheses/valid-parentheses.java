class Solution {
    public boolean isValid(String s) {
        Stack<Character> result = new Stack<>();
        for (int i = 0; i < s.length(); i++){
            if(!result.isEmpty() && 
               (result.peek() == '(' && s.charAt(i) == ')' || 
                result.peek() == '{' && s.charAt(i) == '}' || 
                result.peek() == '[' && s.charAt(i) == ']')) {
                result.pop();
            } else {
                result.push(s.charAt(i));
            }
        }
        return result.isEmpty();
    }
}

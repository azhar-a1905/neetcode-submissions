class Solution {
    public int evalRPN(String[] tokens) {
        Stack <Integer> oprands = new Stack<>();

        for(int i=0;i<tokens.length;i++)
              
            if(tokens[i].equals("+")||tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int right=oprands.pop();
                int left=oprands.pop();
               int result;

if (tokens[i].equals("+")) {
    result = left + right;
} else if (tokens[i].equals("-")) {
    result = left - right;
} else if (tokens[i].equals("*")) {
    result = left * right;
} else {
    result = left / right;
}
                oprands.push(result); 
            }
                else{
                     oprands.push(Integer.parseInt(tokens[i]));
                }
        return oprands.pop();
        }
    }

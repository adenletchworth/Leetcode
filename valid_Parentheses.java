import java.util.Stack;
public class valid_Parentheses {
    public static void main(String[] args){
        System.out.println(validParentheses("([{)}])"));
    }

/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order. */

public static boolean validParentheses(String s){
    Stack<Character> paraStack = new Stack<Character>(); //create a stack because if we pop a closed parentheses we would expect its complementary parentheses to be on top of the stack
    for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == '['){ //whichever parentheses we see we will add its complement 
        paraStack.push(']');}
        else if(s.charAt(i) == '{'){
        paraStack.push('}');}
        else if(s.charAt(i) == '('){
        paraStack.push(')');
        }
        else if(paraStack.pop() != s.charAt(i) || s.length() % 2 != 0){ //if we see a closed parentheses we will pop and see if its in our stack
            return false;
        }
    }
    return paraStack.isEmpty();
    
}
    
}

import java.util.Stack;
import java.util.Scanner;
/**
 * Created by ronik.basak on 17/09/16.
 */
public class CheckBalancedParenthesis {

    public static void main(String[] args) {
        CheckBalancedParenthesis obj = new CheckBalancedParenthesis();
        System.out.println("Expression: ");
        Scanner sc = new Scanner(System.in);
        String expression = sc.next();
        boolean flag = checkParenthesis(expression);
        if(flag)
            System.out.println("The parenthesis are balanced.");
        else
            System.out.println("The parenthesis are unbalanced.");
    }

    private static boolean checkParenthesis(String expression) {
        Stack<Character> s = new Stack<Character>();
        boolean f = true;
        for(int i=0;i<expression.length();i++){
            char symbol = expression.charAt(i);
            if((symbol == '(') ||  (symbol == '{') || (symbol == '[')){
                s.push(symbol);
            }
            if((symbol == ')') ||  (symbol == '}') || (symbol == ']')){
                char t = s.pop();
                if((t == '(' && symbol == ')') || (t == '{' && symbol == '}') || (t == '[' && symbol == ']'))
                    continue;
                else {
                    f =false;
                    break;
                }
            }
        }
        return f;
    }
}

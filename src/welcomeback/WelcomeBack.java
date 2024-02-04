/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package welcomeback;

import java.util.Stack;

/**
 *
 * @author ckuete
 */
public class WelcomeBack {
    
    public static boolean isBalancedParentheses(String n){
        
        Stack<Character> st = new Stack<>();
        for(Character c : n.toCharArray()){
            if(c == '('){
                st.push(c);
               
            }else if (c==')'){
                if (st.isEmpty() || st.pop() == ')'){
                    return false;
                }
            }
            
        }
        return st.isEmpty();
       
      
            
        }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       testAndPrint("()", true);
        testAndPrint("()()", true);
        testAndPrint("(())", true);
        testAndPrint("()()()", true);
        testAndPrint("(()())", true);
        testAndPrint(")()(", false);
        testAndPrint(")(", false);
        testAndPrint("(()", false);
        testAndPrint("))", false);
        testAndPrint("(", false);
        testAndPrint(")", false);
    
    }
    
    public static void testAndPrint(String testStr, boolean expected) {
        // Run the test and store the result
        boolean result = isBalancedParentheses(testStr);
        
        // Print the test string, expected result, and actual result
        System.out.println("Test String: " + testStr);
        System.out.println("EXPECTED: " + expected);
        System.out.println("RESULT: " + result);
        
        // Check if the test passed or failed
        if (result == expected) {
            System.out.println("STATUS: PASS");
        } else {
            System.out.println("STATUS: FAIL");
        }
        
        // Print a separator for better readability
        System.out.println("--------------");
    }
    
}

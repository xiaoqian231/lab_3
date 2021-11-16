package Problem27_CheckBrackets;

import java.util.*;

public class CheckBrackets {
    //Given a string of round, curly, and square open and closing brackets,
    // return whether the brackets are balanced (well-formed).
    //For example, given the string "([])", you should return true.
    //Given the string "([)]" or "((()", you should return false.
    public boolean CheckBrackets(String input) {
        ArrayList<String> al = new ArrayList<String>();
        boolean  result=false;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == '{' || input.charAt(i) == '[') {
                al.add(Character.toString(input.charAt(i)));
            } else if (input.charAt(i) == ')' || input.charAt(i) == '}' || input.charAt(i) == ']') {
             if(al.size() != 0 && al.get(al.size()-1).equals("(") && input.charAt(i) == ')'){
                 al.remove(al.size()-1);
             }else if(al.size() != 0 && al.get(al.size()-1).equals("{") && input.charAt(i) == '}'){
                 al.remove(al.size()-1);
             }else if(al.size() != 0 && al.get(al.size()-1).equals("[") && input.charAt(i) == ']'){
                 al.remove(al.size()-1);
             }else {result= false;}
        }
            if (al.isEmpty()){
                result=true;
            }
    }
        return result;
    }
}

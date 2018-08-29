/**
 * Created by papple on 5/19/18.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancerReplacer {

    static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
        int[] intArr = new int[expressions.length];
        for(int i = 0; i < expressions.length; i++ ){
        String str = changeString(expressions[i],maxReplacements[i]);
        intArr[i] = isBalanced(str);
        }
        return intArr;
    }

    static String changeString(String str, int maxChanges){
        str = str.replaceAll("<>","&");
        for(int i = 0; i < maxChanges; i++ ){
            str = str.replaceFirst(">","&");
        }
        str = str.replaceAll("&","<>");
        System.out.println("Cambiada " + str);
        return str;
    }

    static int isBalanced(String str){

        Stack<Character> balancer = new Stack<Character>();
        for(int i = 0; i < str.length(); i++){
            Character c = (Character) str.charAt(i);
            if(c == '<'){
                balancer.push(c);
            } else {
                try{
                    balancer.pop();
                }catch (Exception e){
                    return 0;
                }
            }

        }

        if(balancer.size() > 0)
            return 0;

        return 1;
    }

    /**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int[] res;

        int _expressions_size = 0;
        _expressions_size = Integer.parseInt(in.nextLine().trim());
        String[] _expressions = new String[_expressions_size];
        String _expressions_item;
        for (int _expressions_i = 0; _expressions_i < _expressions_size; _expressions_i++) {
            try {
                _expressions_item = in.nextLine();
            } catch (Exception e) {
                _expressions_item = null;
            }
            _expressions[_expressions_i] = _expressions_item;
        }

        int _maxReplacements_size = 0;
        _maxReplacements_size = Integer.parseInt(in.nextLine().trim());
        int[] _maxReplacements = new int[_maxReplacements_size];
        int _maxReplacements_item;
        for (int _maxReplacements_i = 0; _maxReplacements_i < _maxReplacements_size; _maxReplacements_i++) {
            _maxReplacements_item = Integer.parseInt(in.nextLine().trim());
            _maxReplacements[_maxReplacements_i] = _maxReplacements_item;
        }

        res = balancedOrNot(_expressions, _maxReplacements);
        for (int res_i = 0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }
    }

}

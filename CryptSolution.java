/**
 * Created by papple on 5/7/18.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

public class CryptSolution {

    public static void main(String[] args){
        String[] crypt = {"SEND", "MORE", "MONEY"};
         char [][] solution = {
                         { 'O', '0' },
                         { 'M', '1' },
                         { 'Y', '2' },
                         { 'E', '5' },
                         { 'N', '6'},
                         { 'D', '7' },
                         { 'R', '8' },
                         { 'S', '9' }
                 };


       System.out.println(isValidCrypt(crypt,solution));
    }

    public static boolean isValidCrypt(String[] crypt, char[][] solution){

        HashMap<Character,Integer> map  = new HashMap<Character,Integer>();

        for(int i = 0; i < solution.length;i++){
            Character c = new Character(solution[i][0]);
            Integer in = new Integer(Character.getNumericValue(solution[i][1]));
            map.put(c,in);
        }

        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println(pair.getKey() + " = " + pair.getValue());
        }

        String n1="", n2="",n3="";

        char[] chr1 = crypt[0].toCharArray();
        char[] chr2 = crypt[1].toCharArray();
        char[] chr3 = crypt[2].toCharArray();

        for(int i = 0; i < chr1.length;i++){
            Character c = new Character(chr1[i]);
            n1 = n1 + map.get(c);
        }

        for(int i = 0; i < chr2.length;i++){
            Character c2 = new Character(chr2[i]);
            n2 = n2 + map.get(c2);
        }

        for(int i = 0; i < chr3.length;i++){
            Character c3 = new Character(chr3[i]);
            n3 = n3 + map.get(c3);
        }


        if((Integer.parseInt(n1) + Integer.parseInt(n2)) == Integer.parseInt(n3))
            return true;
        else
            return false;
    }


}

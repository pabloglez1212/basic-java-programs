import sun.jvmstat.monitor.AbstractMonitor;

import java.util.Scanner;

/**
 * Created by papple on 8/21/18.
 */
public class anagram {

    public static void main(String[] args) {

//AMO: AMO AOM MAO MOA OAM OMA
        //Inncomplete
        String str = "AMO";
        for( int idx = 0; idx < str.length(); idx++){
            for(int i = 0; i < str.length(); i++){
                if(i != idx) {
                    System.out.print(str.charAt(idx));
                    System.out.print(str.charAt(i));
                    System.out.println(str.charAt(str.length() - 1));
                }
            }
        }

    }

}

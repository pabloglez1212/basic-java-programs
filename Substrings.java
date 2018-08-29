/**
 * Created by papple on 5/18/18.
 */
public class Substrings {

    public static void main(String[] args) {

        String str = "abcd";
        int lgt = 1;


        while(lgt <= str.length()) {
            for (int i = 0; i <= str.length()-lgt; i++) {
                System.out.println(str.substring(i,i+lgt));
            }
            lgt++;
        }

    }

}

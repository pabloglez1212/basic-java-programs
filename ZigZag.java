/**
 * Created by papple on 5/7/18.
 */
public class ZigZag {

    public static void main(String[] args){

        int[] a = {9, 8, 8, 5, 3, 5, 3, 2, 8, 6};
        boolean flag=false;
        int count = 1, maxcount = 1;
        for(int i=0 ; i < a.length - 1; i++){

            if(flag == false && (a[i] > a[i+1] || a[i] == a[i+1]))
                count++;
            else if(flag == true && (a[i] < a[i+1] || a[i] == a[i+1]))
                count++;
            else{
                count = 1;
                i--;
            }



            if(flag == true)
                flag = false;
            else
                flag = true;

            if(count > maxcount)
                maxcount = count;

        }

        System.out.println(maxcount);
    }

}

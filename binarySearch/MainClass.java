package binarySearch;

import linkedlist.Node;

/**
 * Created by papple on 4/9/18.
 */
public class MainClass {

    public static void main(String[] args){
        int arr[] = {0,1,2,3,4,5,7,8,9,10,18,30,79,199};

        int min=0;
        int max=arr.length-1;
        int mid=(max+min)/2;
        int num=79;
        while(min<max){

            if(arr[mid]==num){
                System.out.println("number found at " + mid + " possition");
                break;
            }
            if (arr[mid]>num)
                max=mid;
            else
                min=mid;
            mid=(max+min)/2;
        }




    }

}

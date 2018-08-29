/**
 * Created by papple on 4/23/18.
 */

import java.util.Scanner;


public class MultipleOfTwoNumbers {



    public int getMultiple(int n1, int n2){

        return getMultiple(n1,n2);
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        int n1=sc.nextInt();
        System.out.println("Enter your second number");
        int n2=sc.nextInt();
        System.out.println("Say something");
        String str = sc.nextLine();
        System.out.println("You said something: " + str);

        MultipleOfTwoNumbers nms = new MultipleOfTwoNumbers();
        System.out.println("Result " + nms.getMultiple(n1,n2));


    }

    }

import java.util.Stack;

public class CandyCrushArray {
public static void main(String[] args){
        int[] numArray = {8,1,1,1,5,3,3,4,2,2,2,2,2,4,4,2,2,1,19,19,20,20,20,20,4,4,3};

        Stack<Integer> stack = new Stack<Integer>();
        boolean repeated = false;

        stack.push(numArray[0]);
        for(int i = 1; i < numArray.length; i++){
            if(stack.peek() == numArray[i]){
                repeated = true;
            } else if(repeated){
                stack.pop();
                if(stack.peek() == numArray[i]){
                    repeated = true;
                    continue;
                }
                
                stack.push(numArray[i]);
                repeated = false;
            } else{
                stack.push(numArray[i]);
            }
        }
        if(repeated)
            stack.pop();
        System.out.println(stack);

    }

}

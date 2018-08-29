/**
 * Created by papple on 5/21/18.
 */


import java.util.Hashtable;
import java.util.Set;


public class ReplaceColumnsRows {


    public static int[][] fillRowColumn(Hashtable table, int[][] arr){

        for(int i = 0; i < arr.length; i++){

            Set<Integer> keys = table.keySet();
            for(Integer key: keys){
                arr[key][i] = 1;
                arr[i][(int)table.get(key)] = 1;
            }

        }

        return arr;

    }

    public static int[][] changeMatrix(int[][] arr){

        //table<Row,Column>
        Hashtable table = new Hashtable();


        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column < arr[0].length;column++){
                if(arr[column][row] == 1)
                    table.put((Integer)row,(Integer)column);
            }
        }


            arr = fillRowColumn(table,arr);

        return arr;

    }


    public static void main(String[] args){


    }


}

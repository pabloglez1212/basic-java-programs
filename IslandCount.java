// Java program to count islands in boolean 2D matrix
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class Islands
{
    static final int ROW = 5, COL = 5;
    boolean visited[][] = new boolean[ROW][COL];
 
    boolean isSafe(int M[][], int row, int col)
    {

        return (row >= 0) && (row < ROW) &&
               (col >= 0) && (col < COL) &&
               (M[row][col]==1 && !visited[row][col]);
    }

    void DFS(int M[][], int row, int col)
    {

        int rowNbr[] = new int[] {-1, -1, -1,  0, 0,  1, 1, 1};
        int colNbr[] = new int[] {-1,  0,  1, -1, 1, -1, 0, 1};
        visited[row][col] = true;

        for (int k = 0; k < 8; k++)
            if (isSafe(M, row + rowNbr[k], col + colNbr[k]) )
                DFS(M, row + rowNbr[k], col + colNbr[k]);
    }
 

    int countIslands(int M[][])
    {
        
       int count = 0;
       
       for(int row = 0; row < ROW; row++){
           for(int col = 0; col < COL; col++){
               if(visited[row][col] == false && M[row][col] == 1){
                    DFS(M,col,row);
                    count++;
               }
           }
           
       }
 
        return count;
    }
 
    // Driver method
    public static void main (String[] args) throws java.lang.Exception
    {
        int M[][]=  new int[][] {{1, 1, 0, 0, 0},
                                 {0, 1, 0, 0, 0},
                                 {0, 0, 0, 1, 1},
                                 {1, 1, 0, 1, 1},
                                 {0, 0, 0, 1, 0}
                                };
        Islands I = new Islands();
        System.out.println("Number of islands is: "+ I.countIslands(M));
    }
} //Contributed by Aakash Hasija

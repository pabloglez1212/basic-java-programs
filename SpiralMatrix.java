/**
 * Created by papple on 8/26/18.
 */
public class SpiralMatrix {

    public static void main(String[] args){

        int n = 2;
        int [][] matrix = fillMatrix(n);
        printMatrix(matrix);
    }

    public static void printMatrix(int [][] matrix){

        for (int i = 0; i < matrix.length;i++){
            for (int j = 0; j < matrix.length;j++){
                if(j == matrix.length -1)
                    System.out.println(matrix[i][j] + " ");
                else
                    System.out.print(matrix[i][j] + " ");
            }

        }

    }

    public static int[][]  fillMatrix(int n){

        int [][] matrix = new int[n][n];

         String pointer = "r";
        int x = 0; int y = 0;
        int s = n - 1;
        int count = n * n +1;
        boolean first = true;
        while(count > 0){
            count--;

            System.out.println("X:" + x + ", Y:" + y + ", COUNT: " + count);

            if(pointer.equals("r")) {
                    matrix[y][x] = count;
                    if(x == s || matrix[y][x+1] > 0) {
                        pointer = "d";
                        y++;
                        continue;
                    }
                x++;
                }
            if(pointer.equals("d")) {
                matrix[y][x] = count;
                if(y == s || matrix[y+1][x] > 0) {
                    pointer = "l";
                    x--;
                    continue;
                }
                y++;
            }
            if(pointer.equals("l")) {
                matrix[y][x] = count;
                if(x == 0 || matrix[y][x-1] > 0) {
                    pointer = "u";
                    y--;
                    continue;
                }
                x--;
            }
            if(pointer.equals("u")) {
                matrix[y][x] = count;
                if(matrix[y-1][x] > 0) {
                    pointer = "r";
                    x++;
                    continue;
                }
                y--;
            }


        }



        return matrix;
    }
}

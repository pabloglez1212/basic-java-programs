/**
 * Created by papple on 4/26/18.
 */
public class TicTacToe {

    public static void main(String[] args) {


        char[][] arr1 = {
                { 'o', 'x', 'x' },
                { 'o', 'o', 'o' },
                { 'x', 'o', 'x' }
        };
        char[][] arr2 = {
                { 'o', 'x', 'x' },
                { 'o', 'o', 'x' },
                { 'o', 'o', 'x' }
        };
        char[][] arr3 = {
                { 'o', 'x', 'x' },
                { 'o', 'o', 'x' },
                { 'o', 'x', 'o' }
        };
        char[][] arr4 = {
                { 'o', 'x', 'x' },
                { 'o', 'x', 'x' },
                { 'x', 'o', 'o' }
        };
        char[][] arr5 = {
                { 'o', 'x', 'x' },
                { 'x', 'o', 'o' },
                { 'x', 'o', 'x' }
        };

        char[][] arr6 = {
                { 'o', 'x', 'x', 'x' },
                { 'x', 'o', 'o', 'x' },
                { 'x', 'o', 'o', 'x' },
                { 'x', 'o', 'x', 'x' }
        };

        char[][] arr7 = {
                { 'o', 'x', 'x', 'x' },
                { 'x', 'o', 'x', 'x' },
                { 'x', 'x', 'o', 'x' },
                { 'x', 'o', 'x', 'u' }
        };



        char[][] arr8 = {
                { 'o', 'x', 'x', 'x' },
                { 'o', 'x', 'x', 'x' },
                { 'x', 'o', 'o', 'x' },
                { 'x', 'o', 'x', 'o' }
        };

        char[][] arr9 = {
                { 'o','x' },
                { 'o','o' }

        };

        char[][] arr10 = {
                { 'o', 'x', '9' },
                { 'b', 'a', 'c' },
                { 'r', 'm', 'd' }
        };

        if(hasWinner(arr1))
            System.out.println("You win");
        else
            System.out.println("Nobody won");
    }

    public static boolean hasWinner(char[][] b) {

        int numSimRow = 0;
        int numSimCol = 0;
        int numSimDiag1 = 0;
        int numSimDiag2 = 0;

        for (int i = 0; i < b.length; i++) {
            numSimRow = 0;
            numSimCol = 0;
            numSimDiag1 = 0;
            numSimDiag2 = 0;
            char firstCharRow = b[i][0];
            char firstCharCol = b[0][i];
            char firstCharDiag= b[0][0];
            char lastCharDiag= b[b.length-1][0];


            for (int j = 0; j < b.length; j++) {
                if (b[i][j] == firstCharRow)
                    numSimRow++;
                if(numSimRow == b.length)
                    return true;

                if(b[j][i] == firstCharCol)
                    numSimCol++;
                if(numSimCol == b.length)
                    return true;

                if(b[j][j] == firstCharDiag)
                    numSimDiag1++;
                if(numSimDiag1 == b.length)
                    return true;

                if(b[j][b.length - j - 1] == lastCharDiag)
                    numSimDiag2++;
                if(numSimDiag2 == b.length)
                    return true;

            }

        }
        return false;

    }



    }

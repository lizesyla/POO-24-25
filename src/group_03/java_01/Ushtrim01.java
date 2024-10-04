package group_03.java_01;
/*
1. Te krijohet metoda printMatrix(char[][] matrix)
   - qe e shtyp matricen e formatuar ne ekran
   a b c
   d e f
   1 2 3

2. Te krijohet metoda generateMatrix(int r, int c)
  - ku r eshte numri i rreshtave dhe c numri i kolonave
  X O O O
  O X O O
  O O X O
  O O O X

3. Te krijohet metoda transformMatrix(char[][] matrix)
  - e cila e kthen nje varg prej matrices

*/
public class Ushtrim01 {
    public static void main(String[] args){
        char[][] matrix = generateMatrix(5, 5);
        printMatrix(matrix);
        char [] array = transformMatrix(matrix);
        for(char c : array){
            System.out.print(c + " ");
        }
    }

    static void printMatrix(char[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static char[][] generateMatrix(int r, int c){
        char[][] matrix = new char[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i == j){
                    matrix[i][j] = 'X';
                }else{
                    matrix[i][j] = 'O';
                }
            }
        }
        return matrix;
    }

    static char[] transformMatrix(char[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        int index = 0;
        char[] array = new char[r * c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                array[index] = matrix[i][j];
                index++;
            }
        }
        return array;
    }
}

class Ushtrim2{
    public static void main(String[] args){

    }
}

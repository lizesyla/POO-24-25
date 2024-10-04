package group_04.java_01;

/*
Detyra 1: Te krijohet metoda printMatrix(char[][] matrix)
    E cila e shtyp matricen ne ekran ne formatin: R x C
     1 2 3 4
     5 6 7 8
     a b c d
     e f g h

Detyra 2: Te krijohet metoda generateMatrix(int r, int c)
    ku r - paraqet numrin e rreshtave dhe c - numrin e kolonave
    Matrica duhet te gjenerohet sipas formatit:
    X O O O O
    O X O O O
    O O X O O
    O O O X O
    O O O O X

Detyra 3: Te krijohet metoda transformMatrix(char[][] matrix)
    e cila na kthen nje varg prej matrices
    a b c
    d e f    =>  a b c d e f g h i
    g h i
 */

public class Ushtrimi01 {
    public static void main(String[] args){
        char[][] matrix = generateMatrix(5, 5);
        printMatrix(matrix);
        char[] array = transformMatrix(matrix);

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
        int c = 0;
        if(r > 0){
            c = matrix[0].length;
        }
        char[] array = new char[r * c];
        int k = 0;
        for (int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
               array[k] = matrix[i][j];
               k++;
            }
        }
        return array;

    }

}

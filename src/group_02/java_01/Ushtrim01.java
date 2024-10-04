package group_02.java_01;

/*
1. Te krijohet metoda shtypMatrix, qe e shtyp nje matrix ne ekran
    0 1 2 3 4
    5 6 7 8 9
    a b c d e
    f g h i j

2. Te krijohet metoda krijoMatrix, qe e krijon matrix ne formatin:
   krijoMatrix(2, 2)
   X O
   O X

   krijoMatrix(3, 3)
   X O O
   O X O
   O O X

3. Te krijohet metoda konvertoMatrixNeVarg
    X O
    O X

    X O O X

 */

public class Ushtrim01 {
    public static void main(String[] args){
        char[][] matrix = krijoMatrix(5, 5);
        shtypMatrix(matrix);
        char[] vargu = konvertoMatrix(matrix);
        for(char v: vargu){
            System.out.print(" " + v);
        }
    }

    static void shtypMatrix(char[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    static char[][] krijoMatrix(int x, int y){
        char[][] matrix = new char[x][y];
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(i == j){
                    matrix[i][j] = 'X';
                }else{
                    matrix[i][j] = 'O';
                }
            }
        }
        return matrix;
    }

    static char[] konvertoMatrix(char[][] matrix){
        int x = matrix.length;
        int y = 0;
        if(x > 0){
            y = matrix[0].length;
        }
        char[] vargu = new char[x * y];
        int i = 0;
        for(char[] v : matrix){
            for(char c: v){
                vargu[i] = c;
                i++;
            }
        }
        return vargu;
    }







}

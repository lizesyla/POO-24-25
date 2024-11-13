package group_01.java_01;


/*
     Te krijohet metoda krijoMatrix(x, y)
     x - rreshtat
     y - kolonat

     krijoMatrix(2, 2)
     X O
     O X

     krijoMatrix(3, 3)
     X O O
     O X O
     O O X
 */

public class Ushtrime01 {
    public static void main(String[] args){
        printMatrix(krijoMatrix(3, 3));
    }

    static void printMatrix(char[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }

    static char[][] krijoMatrix(int x, int y){
        char[][] matrix = new char[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(i == j){
                    matrix[i][j] = 'X';
                }else{
                    matrix[i][j] = 'O';
                }
            }
        }
        return matrix;
    }
}
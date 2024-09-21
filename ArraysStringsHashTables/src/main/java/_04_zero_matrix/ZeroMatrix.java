package _04_zero_matrix;


// Dada una matriz, escribe un algoritmo para establecer ceros en la fila F y columna C si existe un
// 0 en la celda F:C
 
// Ejemplo:
// Input: 2 1 3 0 2
//        7 4 1 3 8
//        4 0 1 2 1
//        9 3 4 1 9
 
// Output: 0 0 0 0 0
//         7 0 1 0 8
//         0 0 0 0 0
//         9 0 4 0 9
 

public class ZeroMatrix {
    
    public void zeroMatrix(int[][] matrix) {

        boolean firstRowZero = hasFirstRowAnyZero(matrix);
        boolean firstColZero = hasFirstColAnyZero(matrix);
      
        checkForZeroes(matrix);
      
        proccesRows(matrix);
        proccesColum(matrix);
      
        if(firstRowZero) {
          setRowToZero(matrix, 0);
        }
      
        if(firstColZero) {
          setColToZero(matrix, 0);
        }
      }
      
      // COMPRUEBA SI LA PRIMERA FILA CONTIENE 0
      private boolean hasFirstRowAnyZero(int[][] matrix) {
        for(int i = 0; i < matrix[0].length; i++) {
          if(matrix[0][i] == 0) return true;
        }
        return false;
      }
      
      
      //COMPRUEBA SI LA PRIMERA COLUMNA CONTIENE 0
      private boolean hasFirstColAnyZero(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
          if(matrix[i][0] == 0) return true;
        }
        return false;
      }
      
      
      //PROCESAR MATRIX EN LOS DEMAS ELEMENTOS EN BUSCA DE 0
      private void checkForZeroes(int[][] matrix) {
        for(int row = 1; row < matrix.length; row++) {
          for(int col = 1; col < matrix[0].length; col++) {
            if(matrix[row][col] == 0) {
              matrix[row][0] = 0;
              matrix[0][col] = 0;
            }
          }
        }
      }
      
      //COMPRUEBA LA PRIMERA FILA SI CONTIENE 0 PARA ESTABLECER LA FILA EN 0
      private void proccesRows(int[][] matrix) {
        for(int row = 0; row < matrix.length; row++) {
          if(matrix[row][0] == 0) {
            setRowToZero(matrix, row);
          }
        }
      }
      
      //ESTABLECER FILA A 0
      private void setRowToZero(int[][] matrix, int row) { 
        for(int col = 0; col < matrix[0].length; col++) {
          matrix[row][col] = 0;
        }
      }
      
      //COMPRUEBA LA PRIMERA COLUMNA SI CONTIENE 0 PARA ESTABLECER LA COLUMNA EN 0
      private void proccesColum(int[][] matrix) {
        for(int col = 0; col < matrix[0].length; col++) {
          if(matrix[0][col] == 0) {
            setColToZero(matrix, col);
          }
        }
      }
      
      //ESTABLECER COLUMNA A 0
      private void setColToZero(int[][] matrix, int col) {
        for(int row = 0; row < matrix.length; row++) {
          matrix[row][col] = 0;
        }
      }
    }

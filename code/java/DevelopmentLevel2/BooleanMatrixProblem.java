package DevelopmentLevel2;

/**
 * Created by ronik.basak on 24/09/16.
 */

/* If a cell arr[i][j] =1, convert its entire row and column as 1.
 */
public class BooleanMatrixProblem {
        public void setOnes(int[][] matrix) {
            boolean firstRowZero = false;
            boolean firstColumnZero = false;

            //set first row and column zero or not
            for(int i=0; i<matrix.length; i++){
                if(matrix[i][0] == 1){
                    firstColumnZero = true;
                    break;
                }
            }

            for(int i=0; i<matrix[0].length; i++){
                if(matrix[0][i] == 1){
                    firstRowZero = true;
                    break;
                }
            }

            //mark zeros on first row and column
            for(int i=1; i<matrix.length; i++){
                for(int j=1; j<matrix[0].length; j++){
                    if(matrix[i][j] == 1){
                        matrix[i][0] = 1;
                        matrix[0][j] = 1;
                    }
                }
            }

            //use mark to set elements
            for(int i=1; i<matrix.length; i++){
                for(int j=1; j<matrix[0].length; j++){
                    if(matrix[i][0] == 1 || matrix[0][j] == 1){
                        matrix[i][j] = 1;
                    }
                }
            }

            //set first column and row
            if(firstColumnZero){
                for(int i=0; i<matrix.length; i++)
                    matrix[i][0] = 1;
            }

            if(firstRowZero){
                for(int i=0; i<matrix[0].length; i++)
                    matrix[0][i] = 1;
            }

        }

    public static void main(String[] args) {
        BooleanMatrixProblem obj = new BooleanMatrixProblem();
        int matrix[][] = new int[][]{
            {1,0,0,0},
            {0,1,0,0},
            {0,0,0,0},
            {0,0,0,0}};
        obj.setOnes(matrix);
        for(int i=0;i<4;i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}


package DSA_with_JAVA._2DArray;

public class Question1 {
    public static void AddMatrix(int [][]matrix1,int row,int column,int [][]matrix2)
    {
        int [][]c=new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                c[i][j]=matrix1[i][j] + matrix2[i][j];
                System.out.print(" [ " + c[i][j] + " ]");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
      int [][]matrix1={{1,2,3},{4,5,6},{7,8,9}};
      int [][]matrix2={{1,2,3},{4,5,6},{7,8,9}};
      AddMatrix(matrix1,3,3,matrix2);
    }
}

package DSA_with_JAVA._2DArray;

public class Question7 {
    public static void TransposeMatrix(int [][]matrix,int row,int column)
    {
        int temp=0;
        for(int i=0;i<row-1;i++)
        {
            for(int j=i+1;j<column;j++)
            {
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;



            }
        }



    }
    public static void main(String[] args) {
        int [][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        TransposeMatrix(matrix,4,4);
    }
}

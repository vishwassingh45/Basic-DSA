package DSA_with_JAVA._2DArray;

public class Question9 {
    public static void RotateAnticlockwise(int [][]matrix,int row,int column)
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
        for(int i=row-1;i>=0;i--)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        RotateAnticlockwise(arr,3,3);
    }
}

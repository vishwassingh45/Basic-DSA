package DSA_with_JAVA._2DArray;

public class Question2 {
    public static int RowWise_MaxmSum(int [][]matrix,int row,int column)
    {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<row;i++)
        {
            int sum=0;
            for(int j=0;j<column;j++)
            {
                sum+=matrix[i][j];

                maxi=Math.max(maxi,sum);

            }
        }
        return maxi;
    }
    public static void main(String[] args) {
          int [][]matrix={{3,4,7,6},{2,8,3,9},{5,4,2,2},{7,3,0,8},{2,8,9,4}};
        System.out.println("Row wise maximum sum : " + RowWise_MaxmSum(matrix,5,4));
    }
}

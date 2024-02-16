package DSA_with_JAVA._2DArray;

public class Question5 {
    public static void WaveForm(int [][]matrix , int row,int column)
    {
        for(int i=0;i<column;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<row;j++)
                {
                    System.out.print(" " + matrix[j][i]);
                }
            }
            else{
                for(int j=row-1;j>=0;j--)
                {
                    System.out.print(" " + matrix[j][i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int [][]matrix={{3,6,4,2},{7,8,11,5},{9,3,2,1},{17,8,5,9}};
        WaveForm(matrix,4,4);
    }
}

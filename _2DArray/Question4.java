package DSA_with_JAVA._2DArray;

public class Question4 {
    public static void  ColumnSum(int [][]matrix ,int row,int column)
    {

        for(int i=0;i<row;i++)
        {
            int sum=0;
            for(int j=0;j<column;j++)
            {

                sum+=matrix[j][i];


            }
            System.out.println(sum);

        }


    }
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        ColumnSum(matrix,3,3);
    }
}

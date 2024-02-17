package DSA_with_JAVA._2DArray;

public class Question10 {
    public static void Rotate180(int [][]matrix,int row,int column)
    {
        // Rotate First Phase in 90 deg
        int temp=0;
        for(int i=0;i<row-1;i++)
        {
            for(int j=i+1;j<column-1;j++)
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
                int ans=matrix[i][j];

            }

        }


        // Rotate second phase in 90 deg


        for(int i=0;i<row-1;i++)
        {
            for(int j=i+1;j<column-1;j++)
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
//                System.out.print(" " + matrix[i][j]);
            }
//            System.out.println();
        }





    }
    public static void main(String[] args) {
        int [][]matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Rotate180(matrix ,4,4);
    }
}

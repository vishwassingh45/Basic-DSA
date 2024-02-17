package DSA_with_JAVA._2DArray;

public class Question6
{
    public static void SpiralMatrix(int [][]matrix,int row,int column)
    {
        int count=0;
        int Total=row*column;

        // Indexes
        int StartingRow=0;
        int EndingRow=row-1;
        int StartingColumn=0;
        int EndingColumn=column-1;

        while(count<Total)
        {
            // StartingRow to EndingColumn
            for(int i=StartingRow; count<Total && i<=EndingColumn;i++)
            {
                System.out.print(" " + matrix[StartingRow][i]);
                count++;
            }
            StartingRow ++;

        }
        // StartingRow to EndingRow
        for(int i=StartingRow;count <Total &&i<=EndingRow;i++)
        {
            System.out.println(" " + matrix[i][EndingColumn]);
            count ++;
        }
        EndingColumn --;
        // EndingRow to StartingRow

        for(int i=EndingColumn ; count<Total &&i>=StartingColumn;i--)
        {
            System.out.print(" " + matrix[EndingRow][i]);
            count ++;

        }
        EndingRow --;


        // EndingRow to StatringRow

        for(int i=EndingRow; count<Total && i>=StartingRow;i--)
        {
            System.out.print(" " + matrix[i][StartingColumn]);
            count ++;
        }
        StartingColumn ++;


    }
    public static void main(String[] args) {
        int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
        SpiralMatrix(matrix,3,3);
    }
}
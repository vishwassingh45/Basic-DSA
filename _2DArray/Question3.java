package DSA_with_JAVA._2DArray;

public class Question3 {
    public static void DiagonalSum(int [][]matrix,int row,int column)
    {

        int Second_part=0;
        int First_part=0;
        int i=0;
        while(i<=row)
        {
            First_part+=matrix[i][i];
            i++;
        }
        int i1=0;
        int j=column-1;

        while(j>=0)
        {
            Second_part+=matrix[i1][j];
            i1++;
            j--;
        }


      System.out.println("Diagonal Sum 1 : " + First_part);
        System.out.println("Diagonal Sum 2 : " + Second_part);
    }
    public static void main(String[] args) {
        int [][]matrix={{5,8,3,9},{6,2,8,4},{5,3,2,2},{2,8,1,9}};
        DiagonalSum(matrix,3,4);
    }
}

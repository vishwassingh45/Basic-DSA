package DSA_with_JAVA._2DArray;

public class Question11 {
    // BrutForce Approach
    public static int Search_element(int [][]matrix,int row,int column,int target)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                if(target==matrix[i][j])
                {
                    return 1;
                }
            }

        }
        return 0;
    }


    public static int Binary_Search(int [][]matrix,int row,int column,int target)
    {
        int start=0, end=row*column-1;
        while(start<=end)
        {
            int mid= start + (end-start)/2;

            int element= matrix[mid/column][mid%column];

            if(element==target)
            {
                return 1;
            }
            else if(target>element)
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return -1;

    }
    public static void main(String[] args) {
        int [][]matrix={{2,6,10,14,18},{20,24,27,29,38},{47,52,78,93,102},{108,111,200,208,320}};
        int target=52;
        System.out.println(Binary_Search(matrix,4,5,target));
    }
}

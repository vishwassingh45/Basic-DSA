package DSA_with_JAVA.KadaneAlgorithim;

public class Question3 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(" " + arr[k]);
                }
                System.out.println();

            }
            System.out.println();

        }
    }
}

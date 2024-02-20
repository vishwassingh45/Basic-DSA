package DSA_with_JAVA.Recursion.Array_using_recursion;

public class Question7 {
    public static int  Even_sum(int []arr,int index)
    {
        // Base case

        if(index>=arr.length)
        {
            return 0;
        }
        int x=arr[index];
      if(arr[index]%2==0)
      {
          return x+ Even_sum(arr,index+1);
      }

      return Even_sum(arr,index+1);


    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
        System.out.println(Even_sum(arr,0));

    }
}

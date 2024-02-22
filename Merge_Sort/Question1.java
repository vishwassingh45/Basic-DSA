package DSA_with_JAVA.Merge_Sort;

public class Question1 {
    // Brute force approach [ TL :- O(n^2)
    public static int CountInverse(int []arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j] && i<j)
                {
                    count++;
                }
            }
        }
        return count;
    }


    public static int MergeElement(int []arr,int start,int mid,int end)
    {
        int inversion=0;
        int [] dummy=new int[end-start+1];
        int left=start,right=mid+1;
        int index=0;
        while(left<=mid && right<=end)
        {
            if(arr[left]<=arr[right])
            {
                dummy[index]=arr[left];
                index++;
                left++;
            }
            else{
                dummy[index]=arr[right];
                inversion=inversion+(mid-left);
                right++;
                index++;
            }
        }
        while(left<=mid)
        {
            dummy[index]=arr[left];
            left++;
            index++;
        }
        while(right<=end)
        {
            dummy[index]=arr[right];
            right++;
            index++;
        }

        index=0;
        while (start<=end)
        {
            dummy[index]=arr[start];
            start++;
            index++;

        }
        return inversion;
    }
    public static int CountInversion(int []arr,int start,int end)
    {
        int inversion=0;
  int mid=0;
        // Base case
        if(end>start)
        {
             mid= start + (end-start)/2;
            inversion+=CountInversion(arr,start,mid);
            inversion+=CountInversion(arr,mid+1,end);
            inversion+=MergeElement(arr,start,mid,end);

        }









return inversion;

    }

    public static void main(String[] args) {
      int []arr={6,3,9,5,2,8,7,1};
      int []ar1={2,3,4,5,6};
      int []ar2={2,4,1,3,5};
        System.out.println(CountInversion(ar2,0,ar2.length-1));

    }
}

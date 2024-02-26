package DSA_with_JAVA.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Question4 {
    public static void SubsetSum(List<List<Integer>>ans, List<Integer>dummy,int index,int []arr,int sum)
    {
        // Base case
        if(index==arr.length)
        {
            ans.add(new ArrayList<>(dummy));
            return;
        }

        // Choice No
        SubsetSum(ans,dummy,index+1,arr,sum);
        // For Choice yes
        dummy.add(arr[index]);
        sum+=dummy.get(index);
        SubsetSum(ans,dummy,index+1,arr,sum);
    }
    public static void main(String[] args) {

    }
}

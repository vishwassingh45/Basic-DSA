package DSA_with_JAVA.BackTracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void subset(List<List<Integer>>list, List<Integer>dummy, int []nums, int index)
    {
        // Base case

        if(index==nums.length)
        {
            list.add(new ArrayList<>(dummy));
            return;
        }

        // choice no
        subset(list,dummy,nums,index+1);
        // choice Yes
        dummy.add(nums[index]);
        subset(list,dummy,nums,index+1);
    }
    public static void main(String[] args) {
        int []nums={1,2,3};
        List<List<Integer>>list=new ArrayList<>();
        subset(list,new ArrayList<>(),nums,0);


    }
}

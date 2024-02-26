package DSA_with_JAVA.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Question3 {

    public static void subset(List<List<Integer>> list, List<Integer> dummy, int[] nums, int index) {
        // Base case

        if (index == nums.length) {
            list.add(new ArrayList<>(dummy));
            return;
        }

        // choice no
        subset(list, dummy, nums, index + 1);

        // choice Yes
        dummy.add(nums[index]);
        subset(list, dummy, nums, index + 1);
        dummy.remove(dummy.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>list=new ArrayList<>();
        subset(list,new ArrayList<>(),nums,0);

        return list;
    }
    public static void main(String[] args) {


    }
}



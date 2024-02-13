package DSA_with_JAVA.KadaneAlgorithim;
import java.util.ArrayList;
public class Question2 {
    public static void suffix_sum(ArrayList<Integer>arr)
    {
        int [] dummy=new int[arr.size()];
        dummy[4]=arr.get(4);
        for (int i = arr.size()-2; i >=0 ; i--) {
            dummy[i]=dummy[i+1]+arr.get(i);
        }

        for (int i = 0; i <=dummy.length-1 ; i++) {
            System.out.print(" " + dummy[i]);
        }


    }
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        arr.add(1); arr.add(2); arr.add(3); arr.add(4); arr.add(5);
        suffix_sum(arr);
    }
}

package DSA_with_JAVA.Binary_Search;

public class Question5 {
    public static int Peak_element_in_Mountain_Array(int []arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = end + (start - end) / 2;
            if (arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid]) {
                return mid;

            }
            if (arr[mid - 1] < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      int []arr={2,4,6,8,10,8,5};
        System.out.println("Peak element in Mountain Array : " + Peak_element_in_Mountain_Array(arr));
    }
}

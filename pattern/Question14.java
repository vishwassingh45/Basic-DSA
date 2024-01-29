package DSA_with_JAVA.pattern;

public class Question14 {
    public static void pattern(int n) {
       int k=0;
        for (int row = 1; row <= n; row++) {
              if(row<=4)
              {
                  k++;
              }
              else{
                  k--;
              }
            for (int col = 1; col <= 7; col++) {
                if (col >= 5 - k && col <= 3 + k ) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }


            }
            System.out.println();

        }


    }
    public static void main(String[] args){
        pattern(7);
    }
}


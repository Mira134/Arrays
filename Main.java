
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s1 = new Scanner(System.in); 
        int n = s1.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = s1.nextInt();
        }
         int min = arr[0];
         int max = arr[0];

         for(int i=1;i<n;i++){
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
    }
}
int span = max - min;
System.out.println(span);
    }
}
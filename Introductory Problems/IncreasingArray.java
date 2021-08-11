import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class IncreasingArray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        arr[0] = sc.nextLong();
        long count = 0;
        for (int i = 1; i < N; i++) {
            arr[i] = sc.nextLong();
            if (arr[i] < arr[i - 1]) {
                count += arr[i - 1] - arr[i];
                arr[i] = arr[i - 1];
            }
        }
        System.out.println(count);
    }
}

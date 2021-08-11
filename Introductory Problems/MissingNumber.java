import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class MissingNumber {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long sum = 0;
        for (int i = 1; i < N; i++) {
            sum += sc.nextLong();
        }
        long genuine = (N * (N + 1)) / 2;

        System.out.println(genuine - sum);
    }

}
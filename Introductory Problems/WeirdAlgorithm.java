import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class WeirdAlgorithm {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        while (N != 1) {
            System.out.print(N + " ");
            if (N % 2 == 0) {
                N /= 2;
            } else {
                N *= 3;
                N += 1;
            }
        }
        System.out.print(N);
    }

}
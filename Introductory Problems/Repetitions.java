import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Repetitions {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char prev = '\0';
        long cur = 1, len = 1;
        for (char c : s.toCharArray()) {
            if (prev != c) {
                prev = c;
                len = max(len, cur);
                cur = 1;
            } else {
                cur++;
            }
        }
        len = max(len, cur);
        System.out.println(len);
    }

}
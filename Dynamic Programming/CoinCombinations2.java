import java.util.*;

/**
 * CoinCombinations2
 */
public class CoinCombinations2 {

    public static int noOfWays(int N,int[] coins)
    {
        int[] dp = new int[N + 1];
        dp[0] = 1;
        int MOD = 1000000007;
        for(int i=0;i<coins.length;i++)
        {
            for (int j = 0; j < dp.length; j++) {
                if (j - coins[i] >= 0) {
                    dp[j] += dp[j - coins[i]];
                    dp[j] %= MOD;
                }
            }
        }
        return dp[N];
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        int[] coins = new int[N];
        for(int i=0;i<N;i++)
        {
            coins[i] = sc.nextInt();
        }
        System.out.println(noOfWays(X,coins));
    }
}
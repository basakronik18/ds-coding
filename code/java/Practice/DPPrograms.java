/*
package Practice;

*/
/**
 * Created by ronik.basak on 28/11/16.
 *//*

public class DPPrograms {

    public int minCost(int cost[][],int m,int n){
        int i,j;
        int tc[][]=new int[m+1][n+1];

        tc[0][0]=cost[0][0];
        for(i=1;i<=m;i++)
            tc[i][0] = tc[i-1][0] + cost[i][0];
        for(j=1;j<=n;j++)
            tc[0][j] = tc[0][j-1] + cost[0][j];

        for(i=1;i<=m;i++)
            for(j=1;j<=n;j++)
                tc[i][j]=min(tc[i-1][j],tc[i][j-1],tc[i-1][j-1])+cost[i][j];

        return tc[m][n];
    }

    private int min(int x, int y, int z) {
        if(x<y){
            return (x<z)?x:z;
        }
        else
        return 0;
    }



    //Knapsack Problem O(nW)
    class Knapsack
    {

        // A utility function that returns maximum of two integers
        static int max(int a, int b) { return (a > b)? a : b; }

        // Returns the maximum value that can be put in a knapsack of capacity W
        static int knapSack(int W, int wt[], int val[], int n)
        {
            int i, w;
            int K[][] = new int[n+1][W+1];

            // Build table K[][] in bottom up manner
            for (i = 0; i <= n; i++)
            {
                for (w = 0; w <= W; w++)
                {
                    if (i==0 || w==0)
                        K[i][w] = 0;
                    else if (wt[i-1] <= w)
                        K[i][w] = max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]);
                    else
                        K[i][w] = K[i-1][w];
                }
            }

            return K[n][W];
        }


        // Driver program to test above function
        public static void main(String args[])
        {
            int val[] = new int[]{60, 100, 120};
            int wt[] = new int[]{10, 20, 30};
            int  W = 50;
            int n = val.length;
            System.out.println(knapSack(W, wt, val, n));
        }
    }
*/
/*This code is contributed by Rajat Mishra *//*

}
*/

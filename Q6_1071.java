/*
 * Name: Amaresh Swain
 * Reg No: 2341019646
 * PS LINK: https://cses.fi/problemset/task/1071
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6_1071
{
    public static void main(String[] args)throws IOException
    {
        int t;
        long a,b,ans=0;

        FastScanner scanner = new FastScanner();

        t=scanner.nextInt();
        while(t-- > 0)
        {

            a=scanner.nextLong();
            b=scanner.nextLong();

            if(b<=a)
                ans=a%2==0?a*a-b+1:(a-1)*(a-1)+b;
            else
                ans=b%2==0?(b-1)*(b-1)+a:b*b-a+1;

            System.out.println(ans);

        }
    }
}

class FastScanner {
    BufferedReader br;
    StringTokenizer st;

    public FastScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }
    long nextLong() {
        return Long.parseLong(next());
    }

}

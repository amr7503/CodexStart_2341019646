/*
 * Name: Amaresh Swain
 * Reg No: 2341019646
 * PS LINK: https://cses.fi/problemset/task/1754
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Q10_1754
{
    public static void main(String[] args) throws IOException
    {
        int t,a,b;
        FastReader sc=new FastReader();
        t= sc.nextInt();

        while(t-- > 0 )
        {
            a=sc.nextInt();
            b=sc.nextInt();

            if(a>b*2 || b>a*2)
            {
                System.out.println("NO");
                continue;
            }

            a=a%3;
            b=b%3;

            if((a==0 & b==0) || (a==1 && b==2) || (a==2 && b==1))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }

        }
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}


/*
 * Name: Amaresh Swain
 * Reg No: 2341019646
 * PS LINK: https://cses.fi/problemset/task/1092
 */

import java.io.*;
public class Q7_1092
{
    public static void main(String[] args)throws IOException
    {
        int i,n;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());

        StringBuilder sb=new StringBuilder();

        if(n%4==0)
        {
            sb.append("YES\n");
            sb.append(n/2).append("\n");

            for(i=1;i<=n;i+=4)
                sb.append(i).append(" ");

            for(i=4;i<=n;i+=4)
                sb.append(i).append(" ");

            sb.append("\n");
            sb.append(n/2).append("\n");

            for(i=2;i<=n;i+=4)
                sb.append(i).append(" ");

            for(i=3;i<=n;i+=4)
                sb.append(i).append(" ");


        }
        else if (n%4==3)
        {
            sb.append("YES\n");
            sb.append(n/2+1).append("\n");

            for(i=1;i<=n;i+=4)
                sb.append(i).append(" ");

            for(i=2;i<=n;i+=4)
                sb.append(i).append(" ");

            sb.append("\n");
            sb.append(n/2).append("\n");

            for(i=4;i<=n;i+=4)
                sb.append(i).append(" ");

            for(i=3;i<=n;i+=4)
                sb.append(i).append(" ");

        }
        else
        {
            sb.append("NO\n");
        }

        System.out.println(sb);

    }
}

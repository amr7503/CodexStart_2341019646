/*
 * Name: Amaresh Swain
 * Reg No: 2341019646
 * PS LINK: https://cses.fi/problemset/task/1070
 */

import java.util.Scanner;
public class Q5_1070
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        if (n==1) System.out.println(1);
        else if (n<=3) System.out.println("NO SOLUTION");
        else if (n==4) System.out.println("3 1 4 2");
        else
        {
            for (int i=1;i<=n;i+=2)
                sb.append(i+" ");

            for (int i=2;i<=n;i+=2)
                sb.append(i+" ");
            System.out.println(sb);
        }
    }
}
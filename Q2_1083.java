/*
 * Name: Amaresh Swain
 * Reg No: 2341019646
 * PS LINK: https://cses.fi/problemset/task/1083
 */


import java.util.Scanner;
public class Q2_1083 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] hash=new int[n+1];
        for(int i=1;i<n;i++)
        {
            hash[sc.nextInt()]=1;
        }
        for (int i = 1; i <=n; i++)
        {
            if(hash[i]==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}


/*
 * Name: Amaresh Swain
 * Reg No: 2341019646
 * PS LINK: https://cses.fi/problemset/task/1618
 */

import java.util.Scanner;
public class Q9_1618
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,i=5;

        while(n>=i)
        {
            c+=n/i;
            i=i*5;
        }
        System.out.println(c);
    }
}

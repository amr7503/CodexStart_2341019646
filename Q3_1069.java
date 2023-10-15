/*
 * Name: Amaresh Swain
 * Reg No: 2341019646
 * PS LINK: https://cses.fi/problemset/task/1069
 */


import java.util.Scanner;
public class Q3_1069
{
    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);
        String s=obj.next();

        int lmax=1,gmax=1;

        for (int i = 1; i < s.length(); i++)
        {
            if(s.charAt(i)==s.charAt(i-1)) lmax++;
            else {
                gmax=Math.max(gmax,lmax);
                lmax=1;
            }
        }
        gmax=Math.max(gmax,lmax);

        System.out.println(gmax);

    }
}

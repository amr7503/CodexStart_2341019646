/*
 * Name: Amaresh Swain
 * Reg No: 2341019646
 * PS LINK: https://cses.fi/problemset/task/1617
 */

import java.math.BigInteger;
import java.util.*;
public class Q8_1617
{
    public static void main(String[] args)
    {

        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();

        BigInteger base=BigInteger.valueOf(2);
        BigInteger exp=BigInteger.valueOf(n);
        BigInteger m=BigInteger.valueOf(1000000007);

        BigInteger ans=base.modPow(exp,m);
        System.out.println(ans);

    }
}

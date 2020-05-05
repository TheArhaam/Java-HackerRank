import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        // FOR EACH QUERY
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            // FOR EACH LINE
            for(int j=1;j<=n;j++)
            {   
                int res = a;
                int temp = 1;
                // FOR CALCULATING INDIVIDUAL VALUES
                for(int k=1;k<=j;k++)
                {
                    res = res + (temp*b);
                    temp = temp*2;
                }
                System.out.print(res+" ");
            }
            System.out.print('\n');
        }
        in.close();
    }
}
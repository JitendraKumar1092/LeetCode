//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int[] A = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.minimumInteger(N, A);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int minimumInteger(int N, int[] A) {
         
         long sum=0; 
         int min=Integer.MAX_VALUE;
         
         for(int i=0;i<A.length;i++)
         {
             sum=sum+A[i];
         }
         
         for(int i=0;i<A.length;i++)
         {
             if(sum<=(long)A.length*A[i])
             {
                 if(A[i]<min)
                   min=A[i];
             } 
         }
         // return 
         return min;
         
    }
}
        

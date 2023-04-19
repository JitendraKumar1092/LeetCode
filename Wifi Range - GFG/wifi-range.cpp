//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function Template for C++

class Solution{
    public:
    bool wifiRange(int N, string S, int X){
        // code here
        int vis[N+1]={0};
        
        int left=0,right=0;
         
        for(int i=0;i<S.size();i++)
        {
            int lefttimee=X,rightimee=X;
            if(S[i]=='1')
            {
                vis[i]=1;
                left=i-1;
                right=i+1;
                while(lefttimee>0 && left>=0)
                {
                    vis[left]=1;
                    left--;
                    lefttimee--;
                }
                
                while(rightimee>0 && right<N)
                {
                    vis[right]=1;
                    right++;
                    rightimee--;
                }
            }
             
        }
        
       for(int i=0;i<N;i++)
       {
           if(vis[i]==0) return false;
       }
        
        return true;
    }
};

//{ Driver Code Starts.

int main(){
    int T;
    cin >> T;
    while(T--){
        int N, X;
        string S;
        cin >> N >> X >> S;
        Solution obj;
        cout << obj.wifiRange(N, S, X) << "\n";
    }
}

// } Driver Code Ends
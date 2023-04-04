//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

int minSteps(string str) {
    // Write your code here.
    int counta=0;
    int countb=0;
    if(str[0]=='a'){
        counta++;
    }
    else{
        countb++;
    }
    for(int i=1;i<str.length();i++){
        if((str[i]==str[i-1])){
            continue;
        }
        else{
            if(str[i]=='a'){
                counta++;
            }
            else{
                countb++;
            }
        }
    }
      
       int ans=min(counta,countb);
       ans=ans+1;
       return ans;
    
    
}



//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;
    while (t--) {
        string str;
        cin >> str;
        cout << minSteps(str) << endl;
    }
}

// } Driver Code Ends
//dãy con có tổng bằng s
#include<bits/stdc++.h>
using namespace std;
int n,s;
bool dp[40001];
int main(){
    int t;cin>>t;
    while(t--){
        dp[0]=true;
        for(int i=1;i<=s;i++) dp[i]=false;

        cin>>n>>s;
        vector<int> A(n+1);
        for(int i=1;i<=n;i++)
            cin>>A[i];
        for(int i=1;i<=n;i++){
            for(int j=s;j>=A[i];j--){
                if(dp[j-A[i]]) dp[j]=true;
            }
        }
        if(dp[s]) cout<<"YES"<<endl;
        else cout<<"NO"<<endl;

    }
}

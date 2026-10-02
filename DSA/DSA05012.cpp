//Tổ hợp C(n,k)
//1<=k<=n<=1000
#include<bits/stdc++.h>
using namespace std;
int n,k;
long long C[1001][1001];
long long m=1e9+7;
void Pascal(){
    for(int i=0;i<=1000;i++){
        C[0][i]=0;
    }
    C[1][1]=1; C[1][0]=1;
    for(int i=2;i<=1000;i++){
        for(int j=0;j<=i+1;j++){
            C[i][j]=(C[i-1][j]+C[i-1][j-1])%m;
            //cout<<C[i][j]<<" ";
        }
        //cout<<endl;
    }
}
int main(){
    Pascal();
    int t;cin>>t;
    while(t--){
        cin>>n>>k;
        cout<<C[n][k]<<endl;
    }
}

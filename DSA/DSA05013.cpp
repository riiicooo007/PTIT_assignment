//bài toán bậc thang
//số cách bước đi từ bậc thang thứ 0 đến bậc thang thứ n 
//mỗi bước tôi đa được k bậc
//1<=n<=100000; 1<=k<=100
#include<bits/stdc++.h>
using namespace std;
int n,k;
long long s[100001];
long long m=1e9+7;
void proccess(){
    for(int i=1;i<=n;i++){
        s[i]=0;
    }
    s[0]=0;s[1]=1;
    for(int i=2;i<=k;i++){
        s[i]=2*s[i-1];
        s[i]=s[i]%m;
    }
    for(int i=k+1;i<=n;i++){
        for(int j=i-k;j<i;j++){
            s[i]+=s[j];
            s[i]=s[i]%m;
        }
    }
}
int main(){
    int t;cin>>t;
    while(t--){
        cin>>n>>k;
        proccess();
        cout<<s[n]<<endl;
    }
}

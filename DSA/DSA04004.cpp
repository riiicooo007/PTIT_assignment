//gấp đôi dãy số
//tìm số ở vị trí thứ k theo quy luật
#include<bits/stdc++.h>
using namespace std;
long long n,k;
void proccess(){
    int x=1;
    for(long long i=2;i<=1e16;i*=2){
        if(k%i==i/2) break;
        x++;
    }
    cout<<x<<endl;
}
int main(){
    int t;cin>>t;
    while(t--){
        cin>>n>>k;
        proccess();
    }
}

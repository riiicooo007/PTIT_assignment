//dãy xâu fibonaci
//in ra ki tự ở vị trí thứ k sau khi tạo xâu
#include<bits/stdc++.h>
using namespace std;
long long n,k;
long long len[94];

void proccess(long long index){
    //cout<<k<<" "<<index<<endl;
    if(index==1){
        cout<<'A'<<endl;
        return;
    }
    else if(index==2){
        cout<<'B'<<endl;
        return;
    }
    if(k<=len[index-2])
        proccess(index-2);
    else if(k>len[index-2]){
        k-=len[index-2];
        proccess(index-1);
    }
}
int main(){
    int t;cin>>t;
    len[0]=len[1]=len[2]=1;
    for(int i=3;i<=92;i++){
        len[i]=len[i-2]+len[i-1];
    }
    while(t--){
        cin>>n>>k;
        long long index=0;
        proccess(n);
    }
}

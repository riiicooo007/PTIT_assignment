//bài toán con ếch
//con ếch nhảy được tối đa 3 bước về phía trước
//in ra số cách nhảy đến ô thứ n
#include<bits/stdc++.h>
using namespace std;
int n;
long long s[51];
void proccess(){
    s[0]=1;
    s[1]=1;
    s[2]=2;
    s[3]=4;
    for(int i=4;i<=51;i++){
        for(int j=i-3;j<i;j++){
            s[i]+=s[j];
        }
    }
}
int main(){
    proccess();
    int t;cin>>t;
    while(t--){
        cin>>n;
        cout<<s[n]<<endl;
    }
}

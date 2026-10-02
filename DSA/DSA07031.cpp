//bài toán tiền tố dùng stack
#include<bits/stdc++.h>
using namespace std;
vector<string> temp(1001);
int n;
bool dau(string s){
    return (s=="+"||s=="-"||s=="*"||s=="/");
}
long long calc(long long x,string dau,long long y){
    if(dau=="+") return x+y;
    if(dau=="-") return x-y;
    if(dau=="*") return x*y;
    if(dau=="/") return x/y;
}
void proccess(){
    //stack<string> dau;
    stack<long long> hangtu;
    int soluong=0;
    for(int i=1;i<=n;i++)
        cin>>temp[i];
    for(int i=n;i>=1;i--){
        if(dau(temp[i])){
            if(soluong>=2){
                long long x=hangtu.top();hangtu.pop();
                long long y=hangtu.top();hangtu.pop();
                hangtu.push(calc(x,temp[i],y));
                soluong--;
            }
        }
        else{
            hangtu.push(stoll(temp[i]));
            soluong++;
        }
    }
    cout<<hangtu.top()<<endl;

}
int main(){
    int t;cin>>t;
    while(t--){
        cin>>n;
        proccess();
    }
}

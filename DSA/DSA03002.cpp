//nhầm chữ số
#include<bits/stdc++.h>
using namespace std;
pair<int,int> findmM(int n){
    int Max=0,Min=0;
    stack<int> mem;
    while(n){
        mem.push(n%10);
        n/=10;
    }
    while(!mem.empty()){
        int cur=mem.top();
        mem.pop();
        if(cur==5||cur==6){
            Max=Max*10+6;
            Min=Min*10+5;
        }
        else {
            Min=Min*10+cur;
            Max=Max*10+cur;
        }
    }
    return {Min,Max};
}

int main(){
    int A,B;
    cin>>A>>B;
    pair<int,int> mMA,mMB;
    mMA=findmM(A);
    mMB=findmM(B);
    cout<<mMA.first+mMB.first<<" "<<mMA.second+mMB.second;
}

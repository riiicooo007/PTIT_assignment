//đếm dãy
//tìm số dãy nguyên dương có tổng bằng n
//in kết quả số dư của số vừa tìm được cho 123456789
#include<bits/stdc++.h>
using namespace std;
long long n;
long long m=123456789;
long long proccess(long long k){
    //cần tìm 2^(n-1)
    if(k==0) return 1;
    if(k==1) return 2;
    long long tmp=proccess(k/2)%m;
    if(k%2==0) return (tmp*tmp)%m;
    return (tmp*tmp*2)%m;
}
int main(){
    int t;cin>>t;
    while(t--){
        cin>>n;
        cout<<proccess(n-1)<<endl;
    }
}

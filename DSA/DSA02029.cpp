//bài toán tháp Hà Nội
//in ra thứ tự các bước thực hiện là tối ưu (2n-1)
//dùng đệ quy
#include<bits/stdc++.h>
using namespace std;
int n;
void proccess(int k,string from,string to,string bridge){
    if(k==1){
        cout<<from<<" -> "<<to<<endl;
        return;
    }
    proccess(k-1,from,bridge,to);
    proccess(1,from,to,bridge);
    proccess(k-1,bridge,to,from);

}
int main(){
    cin>>n;
    proccess(n,"A","C","B");

}

//in ra các dãy con tăng dần theo thứ tự từ điển
//lưu ý:
//1, các dãy con phải theo thứ tự xuất hiện
//2, thứ tự từ điển là xét theo giá trị sau khi biến đổi thành string
#include<bits/stdc++.h>
using namespace std;
int n;
int A[21];
string chosen;
vector<int> Index(21);
set<string> way;
void inra(){
    for(auto x:way)
        cout<<x<<endl;
}
void duyet(int id,string s){
    for(int i=id+1;i<=n;i++){
        if(A[i]>A[id]){

            way.insert(s+" "+to_string(A[i]));
            duyet(i,s+" "+to_string(A[i]));
        }
    }
}
int main(){
    cin>>n;
    for(int i=1;i<=n;i++){
        cin>>A[i];
    }
    for(int i=1;i<=20;i++) Index[i]=i;
    stable_sort(Index.begin()+1,Index.begin()+n+1,[](int a,int b){return A[a]<A[b];});
    for(int i=1;i<=n;i++){
        duyet(Index[i],to_string(A[Index[i]]));
    }
    inra();
}

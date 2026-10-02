//Liệt kê xâU ký tự
#include<bits/stdc++.h>
using namespace std;
char c;int n;
vector<char> cc(101);
void inra(){
    for(int i=1;i<=n;i++)
        cout<<cc[i];
    cout<<endl;
}
void duyet(int index){
    if(index==n+1){
        inra();
        return;
    }
    for(char x=cc[index-1];x<=c;x++){

        cc[index]=x;
        duyet(index+1);
    }
}
int main(){
    cc[0]='A';
    cin>>c>>n;
    duyet(1);
}

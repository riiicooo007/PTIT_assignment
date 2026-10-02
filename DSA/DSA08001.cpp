//bài củ chuối
#include<bits/stdc++.h>
using namespace std;
int n;
int check;
int integer;
int main(){
//    freopen("inp.txt","r",stdin);
//    freopen("out.txt","w",stdout);
    int t;cin>>t;
    while(t--){
        queue<int> qe;
        cin>>n;
        while(n--){
            cin>>check;
            if(check==1) cout<<qe.size()<<endl;
            else if(check==2) {
                if(qe.empty()) cout<<"YES"<<endl;
                else cout<<"NO"<<endl;
            }
            else if(check==3) {cin>>integer; qe.push(integer);}
            else if(check==4) {if(!qe.empty()) qe.pop();}
            else if(check==5){
                if(qe.empty()) cout<<-1<<endl;
                else cout<<qe.front()<<endl;
            }
            else if(check==6){
                if(qe.empty()) cout<<-1<<endl;
                else cout<<qe.back()<<endl;
            }
        }
    }
}

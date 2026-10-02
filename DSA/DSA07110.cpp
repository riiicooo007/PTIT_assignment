//kiểm tra dãy ngoặc đúng
#include<bits/stdc++.h>
using namespace std;
bool daumo(char c){
    return (c=='('||c=='['||c=='{');
}
bool check(char c1,char c2){
    return ((c1=='}'&&c2=='{')||(c1==']'&&c2=='[')||(c1==')'&&c2=='('));
}
void process(){
    stack<char> st;
    string s;cin>>s;
    bool noo=false;
    for(int i=0;i<s.size();i++){
        if(daumo(s[i])) st.push(s[i]);
        else if(!daumo(s[i])&&st.empty()){
            noo=true;
            break;
        }
        else if(!st.empty()){
            if(!check(s[i],st.top())){
                noo=true;
                break;
            }
            else if(check(s[i],st.top())) st.pop();
        }

    }
    if(noo) cout<<"NO"<<endl;
    else cout<<"YES"<<endl;
}
int main(){
    int t;cin>>t;
    while(t--){
        process();
    }
}

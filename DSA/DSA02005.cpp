#include<bits/stdc++.h>
using namespace std;
string str;
vector<char> ch(13);
int s;
void inra(){
    for(int i=1;i<=s;i++) 
           cout<<ch[i];
    cout<<" ";
}
void duyet(){
    inra();
    while(true){
        int i=s;
        for(i=s;i>1;i--){
            if(ch[i]>ch[i-1]){
                for(int j=s;j>=i;j--){
                    if(ch[i-1]<ch[j]){
                        swap(ch[i-1],ch[j]);
                        sort(ch.begin()+i,ch.begin()+s+1);
                        inra();
                        //i=s;
                        break;
                    }

                }
                break;
            }
        }
        if(i==1) break;
    }

}
int main(){
    int t;cin>>t;
    while(t--){
        cin>>str;
        sort(str.begin(),str.end());
        s=str.size();
        for(int i=1;i<=s;i++){
            ch[i]=str[i-1];
        }

        duyet();
        cout<<endl;
    }

}

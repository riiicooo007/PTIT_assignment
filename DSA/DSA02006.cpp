//dãy con có tổng bằng k
//các phần tử trong dãy dương và khác nhau
//các phàn tử nhỏ hơn 101, số phần tử ít hơn 11
#include<bits/stdc++.h>
using namespace std;
int n;
int k;
int A[11];
vector<int> chosen;
bool have=false;
void inra(){
    int s=chosen.size();
    cout<<"[";
    for(int i=0;i<s;i++){
        if(i==s-1){
            cout<<chosen[i];
            break;
        }
        cout<<chosen[i]<<" ";
    }
    cout<<"] ";
}
void duyet(int index,int sum){

    for(int i=index+1;i<=n;i++){
        if(sum+A[i]<k) {
            chosen.push_back(A[i]);
            duyet(i,sum+A[i]);
            chosen.pop_back();
        }
        else if(sum+A[i]==k){
            chosen.push_back(A[i]);
            inra();
            have=true;
            chosen.pop_back();
        }
        else break;
    }
}
int main(){
    int t;cin>>t;
    while(t--){
        have=false;
        cin>>n>>k;
        for(int i=1;i<=n;i++){
            cin>>A[i];
        }
        sort(A+1,A+n+1);
        duyet(0,0);
        if(!have) cout<<-1;
        cout<<endl;
    }
}

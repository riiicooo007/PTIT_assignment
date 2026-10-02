#include<bits/stdc++.h>
using namespace std;
int n;
char path[22];
int A[11][11];
bool have=false;
void inra(){
    for(int i=1;i<=2*n-2;i++){
        cout<<path[i];
    }
    cout<<" ";
}
void duyet(int index,int i,int j){
    if(index==2*n-1){
        inra();
        have=true;
        return;
    }
    if(i+1<=n&&A[i+1][j]==1){
        path[index]='D';
        duyet(index+1,i+1,j);
    }
    if(j+1<=n&&A[i][j+1]==1){
        path[index]='R';
        duyet(index+1,i,j+1);
    }
}
int main(){
    int t;cin>>t;
    while(t--){
        have=false;
        cin>>n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++)
                cin>>A[i][j];
        }
        if(A[1][1]==0||A[n][n]==0){
            cout<<-1<<endl;
            continue;
        }
        duyet(1,1,1);
        if(!have) cout<<-1;
        cout<<endl;
    }
}

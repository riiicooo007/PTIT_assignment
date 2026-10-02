//tìm só cách di chuyển trong ma trận
//ma trận kich thước cho trước và từ ô 0;0 đi được tới tất cả ô còn lại
#include<bits/stdc++.h>
using namespace std;
int n,m;
int A[11][11];
int way[11][11];
int main(){
    int t;cin>>t;
    while(t--){
        cin>>n>>m;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                cin>>A[i][j];
                way[i][j]=0;
            }
        }
        way[1][1]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1&&j==1) continue;
                way[i][j]=way[i-1][j]+way[i][j-1];
            }           
        }
        cout<<way[n][m]<<endl;
    }
}

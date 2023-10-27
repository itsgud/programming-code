#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main() 
{
    int mat[20][20]={0};
    int x,y,v,e,directed=1;
    cout<<"Enter no. of vertex and edge in graph " <<endl;
    cin>>v>>e;
    cout<<"press 1 for directed graph and press 0 for undirected graph "<<endl;
    cin>>directed;
    for(int i=1;i<=e;i++)
    {
        cout<<"enter source and and destination for "<<i<<" edge "<<endl;
        cin>>x>>y;
        if(x<=v &&y<=v)
        {
            mat[x][y]=1;
            if(directed==0)
               mat[y][x]=1;

        }
        else
           cout<<"invalid  edge"<<endl;
    }
    for(int i=1;i<=v;i++)
    {
         for(int j=1;j<=v;j++)
           cout<<mat[i][j];
         cout<<endl;  
    }
    return 0;

}
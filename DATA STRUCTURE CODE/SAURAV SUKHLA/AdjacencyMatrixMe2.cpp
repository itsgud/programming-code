#include<iostream>>
#include<bits/stdc++.h>
using namespace std;
int vectArr[20][20];   // the adjacency matrix initially is 0
int count=0;
void add_edge(int u,int v)  // function to add edge into matrix
{
   vectArr[u][v]=1;
   vectArr[v][u]=1;

}
void displayMatrix(int v)
{
    int i,j;
     for(i=0;i<v;i++)
     {
        for(j=0;j<v;j++)
          cout<<vectArr[i][j]<<" ";

       cout<<endl;
     }
}

int main()
{
    int v=6; // vertex in the graph
    add_edge(0,4);  add_edge(0,3);add_edge(1,2);
    add_edge(1,4); add_edge(1,5);add_edge(2,3);
    add_edge(2,5); add_edge(5,3); add_edge(5,4);
    displayMatrix(v);



}
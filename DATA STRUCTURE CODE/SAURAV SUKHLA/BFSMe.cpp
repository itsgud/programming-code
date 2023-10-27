#include<bits/stdc++.h>
using namespace std;

   //   v--total vertex    s= source vertex from where traverdal is to be done   adj---adjacency list .......
void BFS(vector<int>adj[],int v,int s)   
{
    vector<bool> visited(v+1,false);
    queue<int>q;
    visited[s]=true;
    q.push(s);
    while(!q.empty())
    {
        int u=q.front();
        q.pop();
        cout<<u<<" ";
        for(int v:adj[u])
        {
            if(visited[v]==false)
              {
                visited[v]=true;
                q.push(v);
              }
        }
    }

}
void addEdge(vector<int>adj[],int u,int v)
{
    adj[u].push_back(v);
    adj[v].push_back(u);
}

void printGraph(vector<int>adj[],int v)
{
    for(int i=0;i<v;++i)
    {
        cout<<"vertex "<<i<< " is connected with-->  ";
        for(auto x:adj[i])
          cout<<x<<" ";
       cout<<endl;   
    }
}
int main()
{
    int v=4;
      vector<int>adj[v];
      addEdge(adj,0,1);addEdge(adj,0,2);addEdge(adj,1,2);addEdge(adj,2,3);
      printGraph(adj,v);
      int s=0;
      BFS(adj,v,s);
    
}
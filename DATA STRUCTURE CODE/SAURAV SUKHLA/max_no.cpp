#include<iostream>
using namespace std;
int main()
{
    int n;
   cout<<"enter size:  ";
   cin>>n;
    int *ptr=new int[n]; 
    for ( int i = 0; i < 5; i++)
    {
        /* code */
         cout<<"\nenter no: " ;
         cin>>ptr[i];
    }
    int min=ptr[0];
    for ( int i = 0; i < 5; i++)
    {
        /* code */
        if(ptr[i]<min)
           min=ptr[i];
    }
      
      cout<<"\n "<<min;
      return 0;
    
    
}
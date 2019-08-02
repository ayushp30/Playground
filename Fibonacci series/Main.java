#include <iostream>
using namespace std;
void fibo(int num)
{
  int a=0;
  int b=1;
  int c=0;
  cout<<a<<" ";
  cout<<b<<" ";
  for(int i=1;i<num-1;i++)
  {
    c=a+b;
    cout<<c<<" ";
    a=b;
    b=c;
  }
}
    
int main()
{
  int a;
  cin>>a;
  fibo(a);
  
  return 0;
}
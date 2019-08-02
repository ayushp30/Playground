#include <iostream>
using namespace std;
void fun1(int num)
{
 int a=1;
  int r1=2;
  for(int i=1;i<num;i++)
  {
    a=a*r1;
  }
  cout<<a;
}
void fun2(int num)
{
 int  a=1;
  int r2=3;
  for(int i=1;i<num;i++)
  {
   
    a=a*r2;
  }
  cout<<a;
}
int main()
{
int a;
  cin>>a;
  if(a%2==1)
  {
    fun1((a/2)+1);
  }
  else
  {
    fun2(a/2);
  }
  return 0;
}
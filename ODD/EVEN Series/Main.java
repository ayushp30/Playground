#include <iostream>
using namespace std;
void fun(int num)
{
 int a=0;
  for(int i=1;i<num;i++)
  {
    a++;
  }
  cout<<a;
}
int main()
{
int a;
  cin>>a;
  if(a%2==1)
  {
    cout<<a-1;
  }
  else
  {
    fun(a/2);
  }
	
}
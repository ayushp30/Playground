#include <iostream>
#include<string>
using namespace std;
int main()
{
	string a;
  cin>>a;
  int count1=0;
  for(int i=0;a[i]!='\0';i++)
  {
    count1++;
  }
  int count=1;
  int p;
  int l=0;
  int o=0;
  if(count1<=20)
  {
for(int i=0;a[i]!='\0';i++)
  {
 if(a[i]==a[i+1])
 {
count++;
 }
  else
  {
    cout<<a[i]<<count;
    count=1;
  }
}
  }
  else
  {
    cout<<"Invalid Input";
  }
}
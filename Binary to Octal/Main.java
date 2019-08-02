#include <iostream>
using namespace std;

int main()
{
  int a;
cin>>a;
  int sum1=0;
  int sum=0;
  int i=1;
  int j=1;
  while(a!=0)
  {
int m=a%10;
    sum=sum+m*i;
    i=i*2;
    a=a/10;
  }
  int n[100];
  int h=0;
  while(sum!=0)
  {
int l=sum%8;
    n[h]=l;
    sum=sum/8;
    h++;
  }
  for(int j=h-1;j>=0;j--)
  {
  cout<<n[j];
  }
  return 0;
}
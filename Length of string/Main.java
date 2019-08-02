#include <iostream>
#include<stdio.h>
using namespace std;
int main()
{
  char str[100];
  int count=0;
  scanf("%[^\n]%*c",str);
  for(int i=0;str[i]!='\0';i++)
  {
count++;
  }
  cout<<count;
  return 0;
}
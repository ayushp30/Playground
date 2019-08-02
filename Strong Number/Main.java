#include <stdio.h>
int main() {
  int a;
  int prod=1;
  int sum=0;
scanf("%d",&a);
  int x=a;
  while(x!=0)
  {
    int m=x%10;
    for(int i=1;i<=m;i++)
    {
      prod=prod*i;
    }
    sum=sum+prod;
    prod=1;
    x=x/10;
  }
  if(sum==a)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
    
	return 0;
}
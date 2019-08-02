#include <stdio.h>
int main() {
	int a;
  int sum=0;
  int count=0;
  int prod=1;
  scanf("%d",&a);
  int x=a;
  while(x!=0)
  {
    x=x/10;
    count++;
  }
  int s=count;
  int l=a;
  while(l!=0)
  {
    int m=l%10;
    while(s!=0)
    {
      prod=prod*m;
      s--;
    }
    sum=sum+prod;
    l=l/10;
    s=count;
    prod=1;
  }
  if(sum==a)
  {
    printf("Armstrong Number");
  }
  else
  {
     printf("Not an Armstrong Number");
  }
  
	return 0;
}
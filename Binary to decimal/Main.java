#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  int b=a;
  int i=1;
  int sum=0;
  while(b!=0)
  {
int m=b%10;
    sum=sum+m*i;
    i=i*2;
    b=b/10;
  }
  printf("%d",sum);
  return 0;
}
#include<stdio.h>
int main()
{
  int a;
 scanf("%d",&a);
  int m=a/100;
  int n=a%10;
  int sum=m+n;
  printf("%d",sum);
  return 0;
}
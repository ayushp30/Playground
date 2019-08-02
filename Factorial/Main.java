#include<stdio.h>
int main()
{
	long int a;
  long int n=1;
  long int sum=1;
  scanf("%ld",&a);
  while(n<=a)
  {
    sum=sum*n;
    n++;
  }
  printf("%ld",sum);
  return 0;
}
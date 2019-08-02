#include <stdio.h>
int main() {
	int a;
  int sum=0;
  scanf("%d",&a);
  while(a!=0)
  {
    int m=a%10;
    sum=sum+m;
    a=a/10;
  }
  printf("%d",sum);
	return 0;
}
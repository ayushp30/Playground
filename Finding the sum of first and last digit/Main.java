#include <stdio.h>
int main() {
int a;
  scanf("%d",&a);
  int sum=0;
  int s=a%10;
  while(a!=0)
  {
    int n=a%10;
    sum=sum*10+n;
    a=a/10;
  }
  int l=sum%10;
  printf("%d",s+l);
	return 0;
}
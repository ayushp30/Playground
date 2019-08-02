#include <stdio.h>
int main() {
	
  int a;
  int sum=0;
  scanf("%d",&a);
  while(a!=0)
  {
    int m=a%10;
    sum=sum*10+m;
    a=a/10;
  }
  sum=sum/10;
  int l=sum%10;
  printf("%d",l);
	return 0;
}
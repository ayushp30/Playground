#include <stdio.h>
int main() {
	
  int a;
  int prod=1;
  scanf("%d",&a);
  for(int i=1;i<=a;i++)
  {
    prod=prod*i;
  }
  printf("%d",prod);
	return 0;
}
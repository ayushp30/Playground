#include <stdio.h>
int main() {
	int a;
  scanf("%d",&a);
  int count=1;
  for(int i=1;count<=a;i++)
  {
    if(i%2==1)
    {
      printf("%d \n",i);
      count++;
    }
  }
	return 0;
}
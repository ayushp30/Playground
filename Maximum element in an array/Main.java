#include<stdio.h>
int main()
{
  	int a;
  int b[100];
  scanf("%d",&a);
  for(int i=0;i<a;i++)
  {
    scanf("%d",&b[i]);
  }
  int max=b[0];
  for(int j=0;j<a;j++)
  {
    if(b[j]>max)
    {
      max=b[j];
    }
}
  printf("%d",max);
  return 0;
}
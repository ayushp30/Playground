#include <stdio.h>

int main()
{ 
   int v[100];
  scanf("%d",&v[0]);
  for(int i=1;i<3;i++)
  {
    scanf(", %d",&v[i]);
  }
  int max=v[0];
  for(int j=0;j<3;j++)
  {
    if(v[j]>max)
    {
      max=v[j];
    }
  }
  printf("%d",max);
}
#include<stdio.h>
int main()
{
  int v[100];
  for(int i=0;i<3;i++)
  {
    scanf("%d",&v[i]);
  }
  int temp=0;
  for(int j=0;j<2;j++)
  {
    for(int k=1;k<3;k++)
    {
      if(v[j]>v[k])
      {
        temp=v[j];
        v[j]=v[k];
        v[k]=temp;
      }
    }
  }
  printf("%d",v[1]);
}
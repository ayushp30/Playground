#include<stdio.h>
int main()
{
  float a,b;
  scanf("%f %f",&a,&b);
  float c=(b/360);
  float d=2*3.14*a;
  float e=c*d;
  printf("%.2f",e);
  return 0;
}
#include<stdio.h>
int lcm(int a,int b)
{
 static int i=1;
if(i%a==0 && i%b==0)
{
  return i;
}
  else
  {
    i++;
    return lcm(a,b);
  }
}
int main()
{
  int a,b;
  int d=0;
  int max=0;
  scanf("%d %d",&a,&b);
  
  
    d=lcm(a,b);
 
  printf("%d",d);
  return 0;
}
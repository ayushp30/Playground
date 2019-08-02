// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
int gcd(int a,int b)
{
  if(b==0)
  {
    return a;
  }
  else
  {
    return gcd(b,a%b);
  }
}
int main()
{
 int a,b;
  scanf("%d %d",&a,&b);
  int c=gcd(a,b);
  printf("%d",c);
  
   return 0;
}
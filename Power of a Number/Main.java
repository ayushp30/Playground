#include <stdio.h>
#include<math.h>
int main()
{
  	double a,b;
  scanf("%lf%lf",&a,&b);
  if(b<0)
  {
    printf("Wrong input");
  }
  else
  {
    double result=pow(a,b);
    int x=(int)result;
    
      printf("%d",x);
  }
        
    return 0;
}
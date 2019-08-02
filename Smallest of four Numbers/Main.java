#include <stdio.h>

int main() {
    int a[10];
for(int i=0;i<4;i++)
{
    scanf("%d",&a[i]);
}
int small=a[0];
for(int j=1;j<4;j++)
{
    if(small>a[j])
    {
        small=a[j];
    }
}
printf("%d",small);
	return 0;
}
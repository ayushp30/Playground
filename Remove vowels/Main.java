#include<stdio.h>
int main()
{
  char str[100];
  char t[100];
  scanf("%[^\n]s", str);
  int j=0;
  for( int i=0;str[i]!='\0';i++)
  {
    if(str[i]!='a' && str[i]!='e' && str[i]!='i' && str[i]!='o' && str[i]!='u' && str[i]!='A' && str[i]!='E' && str[i]!='I' && str[i]!='O' && str[i]!='U')
    {
      t[j]=str[i];
      j++;
    }
  }
  t[j]='\0';
  for(int i=0;t[i]!='\0';i++)
  {
    printf("%c",t[i]);
  }
      
  
  return 0;
}
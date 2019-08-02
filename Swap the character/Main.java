#include <iostream>
using namespace std;
int main()
{
  string str1,str2,str3;
  cin>>str1>>str2>>str3;
  for(int i=0;str1[i]!='\0';i++)
  {
if(str1[i]=='a' || str1[i]=='e'|| str1[i]=='i' || str1[i]=='o' || str1[i]=='u' || str1[i]=='A' || str1[i]=='E'|| str1[i]=='I' || str1[i]=='O' || str1[i]=='U')
{
str1[i]='$';
}
  }
  cout<<str1;
  for(int i=0;str2[i]!='\0';i++)
  {
if(str2[i]!='a' && str2[i]!='e' && str2[i]!='i' && str2[i]!='o' && str2[i]!='u' && str2[i]!='A' && str2[i]!='E' && str2[i]!='I' && str2[i]!='O' && str2[i]!='U')
{
str2[i]='#';
}
  }
  cout<<str2;
  for(int i=0;str3[i]!=0;i++)
  {
    if(str3[i]>=93 && str3[i]<=123)
    {
      str3[i]=str3[i]-32;
    }
  }
  cout<<str3;
    return 0;
}
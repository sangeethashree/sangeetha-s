#include<stdio.h>
int main()
{
int a,b,c;
printf("enter the intervals");
scanf("%d",&a);
scanf("%d",&b);
for(c=a;c<=b;c++)
if(c%2==1)
{
printf("%d",c);
}

return 0;
}

#include<stdio.h>
void main()
{
int i=0,j=0;
char str1[100],str2[100];
printf("enter the 1st String");
scanf("%s",str1);
printf("enter the @nd string");
scanf("%s",str2);
while(str1[i]!=='\0')
i++;
while(str2[j]!=='\0')
{str1[i]=str2[j];
i++;
j++;
}
str1[i]!=\'0';
printf("\n the given String is%s",str1);
getch();
}

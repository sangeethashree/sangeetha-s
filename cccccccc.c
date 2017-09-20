#include<stdio.h>
#include<string.h>
int main()
{
    int length,j,wrd=1;
    char string[50];
    
    printf("***provide string***");
    scanf("%s",string);
    length=strlen(string);
    for(j=0;j<length;j++)
    {
        if(string[j]==''&&string[j+1]=='')
        wrd=wrd+1;
    }
    printf("%d words",wrd);
    return 0;
}

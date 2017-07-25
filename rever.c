#include <stdio.h>
#include <string.h>
int main()
{
	int i;
    char s[] = "welcome to mars fire planet";
    int n = strlen(s);
int r = n-1;
    for(i=r;i>=0;i--)
    {
        if(s[i] == ' ' || i == 0)
        {
            int c= (i==0? i: i+1);
            while(c <= r)
                printf("%c", s[c++]);
            printf(" ");
            r = i-1;
        }}
    return 0;}
    

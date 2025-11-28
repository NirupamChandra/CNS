#include<stdio.h>
#include<string.h>

int main(){

    printf("Enter input string : ");
    char inp[40];
    scanf("%s", inp);

    int len = strlen(inp);

    char xorOut[40], andOut[40], orOut[40];
    int i;
    for (i = 0; i < len; i++)
    {
        xorOut[i] = inp[i] ^ 30;
        andOut[i] = inp[i] & 63;
        orOut[i] = inp[i] | 97;
    }
    xorOut[i] = '\0';
    andOut[i] = '\0';
    orOut[i] = '\0';

    puts(xorOut);
    puts(andOut);
    puts(orOut);

}
#include<stdio.h>
#include<string.h>

int main()
{
    printf("Enter plain text ;: ");
    char inp[20];
    scanf("%s",&inp);
    char output[20];
    int i;
    for(i=0; i<strlen(inp); i++){
        output[i] = inp[i] ^ 1;
    }
    output[i] = '\0';
    
    printf("%s\n", output);

    for(i=0; i<strlen(inp); i++){
        output[i] = output[i] ^ 1;
    }
    output[i] = '\0';
    printf("%s\n", output);
}
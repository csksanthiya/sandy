#include <stdio.h>

int main()
{
    int number;
    
    
    printf("Enter any number: ");
    scanf("%d", &number);
    

    if(number > 0)
    {
        printf("Number is POSITIVE");
    }
    else if(number < 0)
    {
        printf("Number is NEGATIVE");
    }
    else
    {
        printf("Number is ZERO");
    }

    return 0;
}

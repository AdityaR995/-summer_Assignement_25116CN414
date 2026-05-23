#include <stdio.h>
int main(){
    float num1, num2, result;
    char op;
    scanf("%c",&op);
    printf("Enter first number:");
    scanf("%f",&num1);
    scanf("%f",&num2);
    switch(op) {
        case '+':
            result=num1+num2;
            printf("Result=%f",result);
            break;
        case '-':
            result=num1-num2;
            printf("Result=%f",result);
            break;
        case '*':
            result=num1*num2;
            printf("Result=%f",result);
            break;
        case '/':
            if(num2!=0){
                printf("%f",num1 / num2);
            }
            else{
                printf("Error");
                break;
            }
        default:
            printf("wrong operator!");
    }
    return 0;
}
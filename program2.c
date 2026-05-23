#include<stdio.h>
#include<math.h>
int main(){
    //finding the simple interest and compound interest
    float p,r,t,si,x,ci;
    scanf("%f%f%f",&p,&r,&t);
    si=(p*r*t)/100;
    x=p*pow(1+r/100,t);
    ci=x-p;
    printf("simple interest is %f\n",si);
    printf("compound interest%f",ci);
    return 0;
}
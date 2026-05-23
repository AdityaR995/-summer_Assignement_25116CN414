#include <stdio.h>
int main() {
    float m1,m2,m3,m4,m5,total,perc;
    scanf("%f %f %f %f %f", &m1, &m2, &m3, &m4, &m5);
    total = m1 + m2 + m3 + m4 + m5;
    perc=total/5;
    printf("Percentage=%f\n", perc);
    if (perc>=90&&perc<=100)
        printf("A");
    else if (perc>=80)
        printf("B");
    else if (perc>=60)
        printf("C");
    else
        printf("D");
    return 0;
}
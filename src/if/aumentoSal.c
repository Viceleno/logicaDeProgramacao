#include <stdio.h>

int main() {
    double sal, por, aum, nsal;
    
    printf("Digite o atual salario do funcionario: ");
    scanf("%lf", &sal);

    if (sal <= 1000) {
        por = 20;
    } else if (sal <= 3000) {
        por = 15;
    } else if (sal <= 8000) {
        por = 10;
    } else {
        por = 5;
    }

    aum = sal * (por / 100);
    nsal = sal + aum;

    printf("Novo salario e: R$ %.2f\n", nsal);
    printf("O aumento e: R$ %.2f\n", aum);
    printf("A porcentagem adotada e: %.0f%%\n", por);

    return 0;
}

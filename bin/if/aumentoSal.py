def aumento_salario():
    sal = float(input("Digite o atual salário do funcionário: "))

    if sal <= 1000:
        por = 20
    elif sal <= 3000:
        por = 15
    elif sal <= 8000:
        por = 10
    else:
        por = 5

    aum = sal * (por / 100)
    nsal = sal + aum

    print(f"Novo salário é: R$ {nsal:.2f}")
    print(f"O aumento é: R$ {aum:.2f}")
    print(f"A porcentagem adotada é: {por:.0f}%")


# Chamando a função
aumento_salario()

def numeros():
  num = int(input("Insira um numero: "))
  soma = num
  while num != 0:
    num = int(input("Insira um numero: "))
    soma = num + soma

  print(f"A soma e: {soma:d}")

numeros()
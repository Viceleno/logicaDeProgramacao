def quatroNumeros():
  tupla = ()

  n = int(input("Insira um número: "))
  tupla = tupla + (n,)
  n = int(input("Insira um segundo número: "))
  tupla = tupla + (n,)
  n = int(input("Insira um terceiro número: "))
  tupla = tupla + (n,)
  n = int(input("Insira o último número: "))
  tupla = tupla + (n,)

  print(f'Você digitou os números {tupla}')
  print(f'O valor 9 apareceu {tupla.count(9)} vezes')
  if 3 in tupla:
    print(f'O valor 3 apareceu na {tupla.index(3)+1}° posição')
  else:
    print('O valor 3 não foi digitado em nenhuma posição')
  pares = ()

  for num in tupla:
    if num % 2 == 0:
      pares = pares + (num,)  

  if pares:
    print(f'Valores pares: {pares}')
  else:
    print('Nenhum valor par foi digitado')

# quatroNumeros()

def tuplaDeQuatroNumeros():
  num = (int(input("Insira um número: ")), int(input("Insira um segundo número: ")), int(input("Insira um terceiro número: ")), int(input("Insira o último: ")))

  print(f'Voce digitou os numeros {num}')
  
  print(f'O valor 9 apareceu {num.count(9)} vezes')
  
  if 3 in num:
    print(f'O valor 3 apareceu na {num.index(3)+1}ª posição')
  else:
    print('O valor 3 não foi digitado em nenhuma posição')

  print('Os valores pares digitados foram: ', end='')
  for n in num:
    if n % 2 == 0:
      print(n, end=' ')

tuplaDeQuatroNumeros()

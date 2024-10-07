def mediaDeIdade():
  n1 = int(input("Digite a primeira idade: "))
  n2 = 0
  soma = 0
  
  while n1 >= 0:
    n2 = n2 + 1
    soma = soma + n1
    n1 = int(input("Digite a idade: "))
 
  if n2 == 0:
    print("Impossível calcular!!")
  else:
    media = soma/n2
    print(f"A media e: {media:.2f}")
  
mediaDeIdade()
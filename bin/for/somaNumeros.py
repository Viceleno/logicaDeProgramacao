def somaNumeros():
  n = int(input("Escreva o numero de repeticoes: "))
  soma = 0
  for i in range(n):
    x = int(input("Escreva um numero: "))
    soma = soma + x
    
  print(f"A soma dos numeros e: {soma:d}")
  
somaNumeros()
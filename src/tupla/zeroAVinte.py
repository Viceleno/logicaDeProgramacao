def zeroAVinte():
  tupla = ('zero', 'um', 'dois', 'tres', 'quatro', 'cinco', 'seis', 'sete', 'oito', 'nove', 'dez', 'onze', 'doze', 'treze', 'quatorze', 'quinze', 'dezesseis', 'dezessete', 'dezoito', 'dezenove', 'vinte')
  x = int(input("Escreva um numero de 0 a 20: "))
  while x < 0 or x > 20:
    print('Numero invalido, tente novamente')
    x = int(input("Escreva um numero de 0 a 20: "))

  print(f'Voce digitou o numero: {x} que corresponde a: {tupla[int(x)]}')
  
zeroAVinte()
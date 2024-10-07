def crescente():
  x = 0
  y = 1
  while x != y:
    x = int(input("Digite o valor de X: "))
    y = int(input("Digite o valor de Y: "))
    if x > y:
      print(f"O valor de x e: {x:d}")
      print(f"O valor de y e: {y:d}")
      print("Ordem DECRESCENTE")
    elif x < y:
      print(f"O valor de x e: {x:d}")
      print(f"O valor de y e: {y:d}")
      print("Ordem CRESCENTE")
      
crescente()
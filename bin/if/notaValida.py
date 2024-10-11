def notaValida():
  nota1 = float(input("Digite uma nota do 1º bimestre entre 0 e 10: "))
  np = 2*6 - nota1
  print(f"A nota necessaria para passar e: {np:.2f}")
 
  
  while (nota1 < 0 or nota1 > 10):
    print("Nota Invalida")
    nota1 = float(input("Digite uma nota do 1º bimestre entre 0 e 10: "))
    np = 2*6 - nota1
    print(f"A nota necessaria para passar e: {np:.2f}")
    
  nota2 = float(input("Digite uma nota do 2º bimestre entre 0 e 10: "))
  while (nota2 < 0 or nota2 > 10):  
    print("Nota Invalida")
    nota2 = float(input("Digite uma nota do 2º bimestre entre 0 e 10: "))  
  media = (nota1 + nota2) / 2
  print(f"A media e: {media:.2f}")
  

notaValida()
def tabuada():
  n = int(input("Voce quer tabuada de que numero? "))
  for i in range(1,11):
    x = n * i
    print(f"{n:d} x {i:d} = {x:d}")
    
tabuada()
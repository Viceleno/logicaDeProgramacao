def sorteio():
  import random
  tupla = (random.randint(1, 10), random.randint(1, 10), random.randint(1, 10), random.randint(1, 10), random.randint(1, 10))
  print(f"Os valores sorteados foram: {tupla}")
  print(f"O maior valor sorteado foi: {max(tupla)} e o menor foi: {min(tupla)}")
  

sorteio()
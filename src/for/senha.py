def senha():
  senha = input("Digite a senha: ")
  while senha != "1234":
    print("Senha Incorreta!")
    senha = input("Digite a senha: ")
  print("Senha Correta!")
  
senha()
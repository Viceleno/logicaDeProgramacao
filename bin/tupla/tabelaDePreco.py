tuplaOriginal = ('Papel', 2.50, 
                 'Lápis', 3.45, 
                 'Caneta', 1.20, 
                 'Caderno', 15.00, 
                 'Livro', 65.00, 
                 'Borracha', 2.00, 
                 'Estojo', 2.50, 
                 'Canetas', 3.50, 
                 'Repetidor', 15.00)
print('-' * 40)
print(f'{"TABELA DE PREÇO":^40}')
print('-' * 40)
for i in range(0, len(tuplaOriginal), 2):
  print(f'{tuplaOriginal[i]:.<30} R${tuplaOriginal[i+1]:>7.2f}')
print('-' * 40)
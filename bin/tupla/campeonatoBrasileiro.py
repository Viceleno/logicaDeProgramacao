def campeonatoBrasileiro():
  times = ('Botafogo','Palmeiras','Fortaleza','Flamengo','São Paulo','Internacional','Bahia','Cruzeiro','Vasco','Atletico-MG','Gremio','Criciuma','Bragantino','Juventude','Athletico-PR','Fluminense','Vitória','Corinthians','Cuiabá','Atlético-GO')
  x = str(input("Coloque o nome do time para saber sua classificaçao!\n"))
  print(f"Os cinco primeiros times da tabelas são: {times[0:5]}")
  print(f"Os quatros últimos times da tabelas são: {times[16:]}")
  print(f"Os times da tabelas em ordem alfabética são: {sorted(times)}")
  print(f"O time do {x} está na {times.index(x)+1}ª posiçao!")

campeonatoBrasileiro()
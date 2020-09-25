Faça um sistema de calculador de hora extra. O sistema deve considerar a seguinte entrada em formato de string:
<dia da semana> <horário de entrada> <horário de saída> <valor da hora>.
Exemplos:
Domingo 8 22 100,00
Segunda 8 17 50,00

Pode considerar o horário de entrada e horário de saída como inteiro.
O cálculo de do valor ser recebido deve considerar:
A quantidade de horas entre horário de entrada e de saída. As 8 primeiras horas deverá ser considerada o valor definido no cadastro do funcionário.
Caso passe das 8h, o cálculo deve considerar o fator multiplicador para as horas extras, considerando o dia da semana:
Dia da semana | Fator multiplicador
Seg até sexta   |         1.5
Sábado             |         1.7
Domingo           |          2.0

Exemplo do cálculo
Exemplo 1:
Entrada: Domingo 8 22 100,00
8-16 -> 8 (hora normal) * R$ 100,00 = R$ 800,00
16 - 22 -> 6(hora extra) * R$ 100,00 * 2 (fator multiplicador do domingo) = R$ 1200,00
Total do valor trabalhado: R$ 2000,00

Exemplo 2
Entrada: Segunda 8 17 50,00
8 - 16 -> 8 (hora normal) * 50 = R$ 400,00
16 - 17 -> 1(hora extra) * 50 * 1,5 (fator multiplicador de segunda a sexta) = R$ 75,00
Total do valor trabalhado: R$ 475,00

Desafio das Horas extras.

Faça um sistema que gerencie o cálculo de horas trabalhadas. Os funcionários devem ser previamente cadastrado no sistema e devem conter: nome com completo, matrícula e valor de sua hora trabalhada. O sistema deve armazenar histórico registros de entrada horas trabalhadas. Cada registro deverá seguir o seguinte padrão:
<matrícula do funcionário>:  <data> <horário de entrada> <horário de saída>
O cálculo de quanto o funcionário deve receber por cada entrada deve considerar:
A quantidade de horas entre horário de entrada e de saída. As 8 primeiras horas deverá ser considerada o valor definido no cadastro do funcionário.
Caso passe das 8h, o cálculo deve considerar o fator multiplicador para as horas extras, considerando o dia da semana:
Dia da semana | Fator multiplicador
Seg até sexta   |         1.5
Sábado             |         1.7
Domingo           |          2.0
O sistema deverá fornecer extrato contentando o histórico de entradas para um funcionário. O usuário entrará com o nome completo do funcionário e receberá o extrato. O extrato deve seguir o seguinte padrão:

Nome completo: Rafael Batista Duarte
Matrícula: 2007220004
Valor da hora trabalhada: R$ 100,00
_______________________________________________________________
Data
Hora entrada
Hora saída
Qtd horas
valor hora
Qtd hora extra
valor hora extra
total valor
13/09/2020
08:00
22:00
8
800
6
1200
2000
16/09/2020
08:00
17:00
8
800
1
150


18/09/2020
09:00
12:00
3
300




19/09/2020
10:00
20:00
8
800
3
510
1310
Total a recebe
Valor total:
 R$ 4260,00


Ps1: Sugiro fazer um menu que permita entra uma opção desejada onde 1 será para cadastrar um funcionário e o usuário entra com os dados via teclado (usando scaner). Sugiro ainda armazenar os funcionários em uma ArrayList (https://www.devmedia.com.br/explorando-a-classe-arraylist-no-java/24298) . O menu pode ter uma segunda opção (opção 2) aonde o usuário entra com o nome do funcionário e obtém o extrato de horas.


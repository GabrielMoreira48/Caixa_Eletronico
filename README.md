Caixa Eletrônico em Java
Projeto em Java que simula um caixa eletrônico de forma interativa no terminal. Ideal para estudo de Java, lógica de programação e menus de terminal.
________________________________________
Funcionalidades
O projeto permite realizar:
1️⃣ Login
•	Autenticação por número de conta e senha.
•	Limite de 3 tentativas antes da conta ser bloqueada.
2️⃣ Saque
Operação	Descrição
Saque	Permite retirar dinheiro, verificando saldo disponível e valores válidos.
Histórico	Cada saque é registrado no histórico de transações.
3️⃣ Depósito
Operação	Descrição
Depósito	Permite adicionar dinheiro à conta, validando valores positivos.
Histórico	Cada depósito é registrado no histórico de transações.
4️⃣ Extrato
Operação	Descrição
Consultar Saldo	Mostra saldo atual formatado em R$.
Histórico de transações	Lista todas as operações realizadas na conta.
5️⃣ Sair / Trocar Conta
Operação	Descrição
Sair	Encerra o sistema ou permite trocar de conta.
________________________________________
Como Executar
1.	Clone o repositório:
git clone https://github.com/GabrielMoreira48/Caixa_Eletronico.git
2.	Abra o projeto no IntelliJ IDEA (ou outro IDE Java).
3.	Compile e execute a classe Main.java.
4.	Um menu interativo será exibido:
==== Menu ===
1 - Saque
2 - Extrato
3 - Deposito
0 - Sair
Escolha sua opção:
5.	Escolha a operação desejada e siga as instruções.
6.	Saques e depósitos serão registrados no histórico, que pode ser consultado no extrato.
________________________________________
Exemplo de Uso
Escolha sua opção: 1
Qual valor deseja sacar R$: 50
Saque concluído! Saldo atual: 1000.00

Escolha sua opção: 3
Qual valor deseja depositar R$: 200
Depósito concluído! Saldo atual: 1200.00

Escolha sua opção: 2
Saldo atual da conta: R$ 1200.00
Histórico de transações:
Saque: -R$50.00
Depósito: +R$200.00
________________________________________
Observações
•	Projeto em Java puro, sem bibliotecas externas.
•	Ótimo para estudos, prática de Java e manipulação de menus interativos.
•	Não armazena dados de forma persistente; ao reiniciar o programa, saldos e histórico são resetados.
________________________________________
Autor
Gabriel Moreira


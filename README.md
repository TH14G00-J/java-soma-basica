# Calculadora de Soma Interativa em Java

🔹 **Funcionalidades:**

* Soma dois números inteiros.
* Formata a saída (ex: `5 + 3 = 8`).
* Loop contínuo até o usuário optar por sair (`Y/N`).
* Lógica isolada em `Calculator` para facilitar testes unitários.

🚀 **Como executar com Maven:**

```bash
# Compilar e rodar o projeto
mvn compile
mvn exec:java -Dexec.mainClass="Application"

# Executar testes unitários
mvn test
```

💻 **Exemplo de uso:**

```
Enter two integers:
5 3
5 + 3 = 8
Do you want to continue? [y/n]
y
Enter two integers:
10 20
10 + 20 = 30
Do you want to continue? [y/n]
n
```

🧪 **Testes unitários:**

* Testes para soma de números positivos, negativos e zero.
* Testes para validação de respostas (`Y/N`).
* Realizados com JUnit 5.

🎯 **Objetivo:**

* Exercício prático de Java com entrada/saída e loops.
* Aprender boas práticas de **separação de lógica**, **testes unitários** e **estrutura Maven**.

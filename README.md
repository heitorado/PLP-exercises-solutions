# Paradigmas de Linguagens de Programação

### Melhorias QdV e Exercícios resolvidos
---

Esse fork feito por [@heitorado](https://github.com/heitorado) contém atualizações neste readme, a inclusão de um arquivo `Makefile`, e exercícios resolvidos na forma de Pull Requests a esse repositório, para que fique melhor ilustrado as mudanças necessárias na linguagem para atingir os objetivos propostos em cada exercício.

## Execução

Para compilação individual de cada linguagem:

```bash
cd <Linguagem>
mvn clean generate-sources compile exec:java
```

Para compilar todas as linguagens e buildar o applet (interpretador):
> (executar o comando na raiz do projeto)
```bash
mvn package
# Jar será gerado em ./Applet/target/.
```

Para executar o applet (interpretador):
> (executar o comando na raiz do projeto)
```bash
java -jar Applet/target/Applet-0.0.1-jar-with-dependencies.jar
```
Usando makefile:
> Para compilar todas as linguagens, o interpretador e executar o interpretador em seguida:
```bash
make plp
```

## Exercícios Resolvidos:
- LE1
  - [Exercício 1: Adiciona tipo char (`ValorChar`) e a operação `toAscii` sobre caracter.](https://github.com/heitorado/PLP-exercises-solutions/pull/1)
  - [Exercicio 2: Implementa `ValorReal` e operações aritméticas sobre os reais](https://github.com/heitorado/PLP-exercises-solutions/pull/2)
  - [Exercício 3: Implementa operadores relacionais para valores inteiros (menor que, maior que)](https://github.com/heitorado/PLP-exercises-solutions/pull/3)
- LE2
  - ☠️
- LF1
  - ☠️
- LF2
  - ☠️   

## Créditos

Baseado no fork de [@fmca](https://github.com/fmca)

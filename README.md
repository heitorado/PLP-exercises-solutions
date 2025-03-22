# Paradigmas de Linguagens de Programação

Repositório do projeto da disciplina Paradigmas de Linguagens de Programação ([in1007](https://www.cin.ufpe.br/~in1007/)) da pós-graduação em Ciência da Computação da UFPE, ministrada pelo Prof.Dr. Augusto Sampaio.

Esse fork feito por @heitorado contém atualizações neste readme, a inclusão de um arquivo `Makefile`, e exercícios resolvidos na forma de Pull Requests a esse repositório, para que fique melhor ilustrado as mudanças necessárias na linguagem para atingir os objetivos propostos em cada exercício.

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

## Créditos

Baseado no fork de @fmca

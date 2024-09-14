# SimpleParserVitors

## Integrantes

Vitor Hugo de Oliveira Paludetto; RA: 21025216

Victor Cristiano do Nascimento Silva; Ra: 21080416

[Link do vídeo](https://youtu.be/jF5dCNl0ISI)

## Como rodar o projeto

- Baixar o Antlr no site oficial [antlr.org](https://www.antlr.org/download/antlr-4.13.2-complete.jar)
- Adicionar o JAR ao BuildPath do projeto
- Para gerar os arquivos JAVA a partir do arquivo G4 executar:
  `java -cp antlr-4.13.2-complete.jar org.antlr.v4.Tool UFABCGrammar.g4 -o src/io/compiler/core -package io.compiler.core`

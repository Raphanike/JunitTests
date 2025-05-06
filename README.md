# Projeto de Testes com JUnit

Este projeto foi criado com o objetivo de introduzir e praticar a utilização de **JUnit** para a realização de testes unitários em métodos simples. A ideia principal é garantir o correto funcionamento de funções e métodos básicos através de testes automatizados.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **JUnit**: Framework para testes automatizados.

## Funcionalidades

- **Testes de Métodos Simples**: O projeto foca na criação de testes para funções básicas em Java, garantindo a qualidade do código e a correção das funcionalidades.
- **Cobertura de Testes**: Através do JUnit, vamos testar métodos como soma, subtração, multiplicação e outras operações simples.

## Como Rodar o Projeto

1. **Instalação do JUnit**:
   - Certifique-se de ter o [Maven](https://maven.apache.org/) ou [Gradle](https://gradle.org/) configurado em seu ambiente de desenvolvimento.
   - Adicione a dependência do JUnit no seu `pom.xml` ou `build.gradle`.

### Exemplo de dependência no `pom.xml` (para Maven):

```xml
<dependencies>
    <!-- Dependência do JUnit -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.7.0</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>j

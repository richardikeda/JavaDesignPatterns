# Abstract Factory

## O que é?

O **Abstract Factory** é um padrão de projeto criacional que permite que você produza famílias de objetos relacionados ou dependentes sem ter que especificar suas classes concretas.

Imagine uma fábrica de móveis: você precisa de uma cadeira, um sofá e uma mesa de centro. Esses produtos devem combinar entre si (por exemplo, todos do estilo Moderno, ou todos do estilo Vitoriano). O padrão Abstract Factory garante que, se você pedir uma cadeira Moderna, também receberá um sofá Moderno, mantendo a consistência do estilo.

## Como funciona?

O padrão define uma interface para criar cada produto distinto (ex: `criarCadeira`, `criarSofa`). As fábricas concretas (ex: `FabricaModerna`, `FabricaVitoriana`) implementam esses métodos para produzir produtos de uma família específica. O código cliente trabalha apenas com as interfaces abstratas, o que o torna independente das classes concretas dos produtos que utiliza.

## Quando é recomendado?

*   **Independência de criação**: Quando seu código precisa trabalhar com várias famílias de produtos relacionados, mas você não quer que ele dependa das classes concretas desses produtos.
*   **Consistência**: Quando você quer garantir que os produtos de uma mesma família sejam usados juntos. O padrão força o uso de produtos compatíveis.
*   **Bibliotecas e Frameworks**: Quando você fornece uma biblioteca de classes de produtos e quer revelar apenas suas interfaces, não suas implementações.

## Quando não é recomendado?

*   **Complexidade desnecessária**: Se você não tem famílias de produtos ou se a lógica de criação é muito simples, o padrão pode introduzir complexidade desnecessária com muitas interfaces e classes.
*   **Evolução difícil**: Adicionar novos tipos de produtos (ex: adicionar uma "Luminária" à família de móveis) exige alterar a interface da Abstract Factory e todas as suas subclasses, o que pode ser trabalhoso se houver muitas fábricas.

## Cenários de Uso

1.  **Interface Gráfica Multiplataforma (UI Toolkit)**:
    *   Imagine que você está desenvolvendo um aplicativo que deve rodar em Windows, macOS e Linux.
    *   Você precisa criar botões, caixas de texto e menus que tenham a aparência nativa de cada sistema operacional.
    *   Uma `GUIFactory` abstrata define métodos como `criarBotao()` e `criarMenu()`.
    *   Uma `WindowsFactory` cria `WindowsButton` e `WindowsMenu`.
    *   Uma `MacOSFactory` cria `MacOSButton` e `MacOSMenu`.
    *   O cliente pede os componentes à fábrica sem saber qual OS está rodando, garantindo que nunca misture um botão do Windows com um menu do macOS.

2.  **Temas de Aplicação**:
    *   Um sistema que suporta temas "Claro" e "Escuro".
    *   A fábrica "Claro" produz componentes com cores claras e fontes escuras.
    *   A fábrica "Escuro" produz componentes com fundos escuros e fontes claras.

3.  **Conexão com Banco de Dados**:
    *   Uma aplicação que precisa suportar diferentes bancos de dados (MySQL, PostgreSQL, Oracle).
    *   A fábrica cria conexões, comandos e leitores de dados específicos para o banco escolhido, garantindo que uma conexão MySQL não tente executar um comando formatado para Oracle.

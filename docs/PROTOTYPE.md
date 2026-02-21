# Prototype

## O que é?

O **Prototype** é um padrão de projeto criacional que permite copiar objetos existentes sem fazer seu código depender de suas classes.

Em vez de instanciar um objeto do zero e configurar todos os seus campos, você copia um objeto existente (o protótipo). Isso é especialmente útil quando a criação do objeto é custosa (ex: requer consultas complexas ao banco de dados) ou quando a configuração do objeto é complexa.

## Como funciona?

O padrão declara uma interface comum para todos os objetos que suportam clonagem (geralmente com um método `clone()`). Um objeto que suporta clonagem é chamado de protótipo. Quando sua aplicação precisa de um novo objeto, ela pede ao protótipo para se clonar.

## Quando é recomendado?

*   **Custo de criação alto**: Quando a criação direta de um objeto é custosa em termos de recursos ou tempo (ex: inicialização pesada, conexões de rede).
*   **Muitas subclasses**: Para evitar uma hierarquia de classes paralelas de fábricas para criar objetos.
*   **Configuração complexa**: Quando você tem objetos com muitas configurações possíveis e quer criar novos objetos baseados em configurações pré-definidas (templates).

## Quando não é recomendado?

*   **Referências circulares complexas**: Clonar objetos que têm referências circulares ou dependências complexas externas pode ser muito difícil e propenso a erros (decidir entre cópia rasa vs. cópia profunda).
*   **Simplicidade**: Se a criação do objeto é rápida e simples usando `new`, usar o Prototype pode ser um exagero.

## Cenários de Uso

1.  **Editor Gráfico (Formas Geométricas)**:
    *   Em um editor de desenho, o usuário cria um retângulo complexo, define cor, borda, sombra e tamanho.
    *   Para criar um segundo retângulo igual, em vez de configurar tudo novamente, o usuário usa a função "Clonar" ou "Duplicar".
    *   O sistema chama o método `clone()` do retângulo selecionado e adiciona a cópia à tela.

2.  **Jogos (Spawning de Inimigos)**:
    *   Um jogo precisa criar hordas de monstros.
    *   Em vez de carregar modelos 3D, texturas e sons do disco para cada novo monstro, o jogo carrega um modelo "protótipo" de cada tipo de monstro na memória.
    *   Novos monstros são criados clonando o protótipo correspondente, o que é muito mais rápido.

3.  **Cache de Configurações**:
    *   Uma aplicação carrega uma configuração pesada do banco de dados na inicialização.
    *   Se precisar modificar essa configuração temporariamente para uma tarefa específica, ela clona o objeto de configuração original, modifica a cópia e a utiliza, preservando o original intacto.

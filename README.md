# Java Design Patterns

Este repositório contém exemplos de implementação dos padrões de projeto (Design Patterns) clássicos do GoF (Gang of Four) em Java. O objetivo é fornecer exemplos claros e didáticos para estudo e referência.

## Padrões Implementados

### Criacionais (Creational)

*   **Singleton**: Garante que uma classe tenha apenas uma instância e fornece um ponto global de acesso a ela.
    *   *Exemplo:* `DatabaseConnection` garante uma única conexão com o banco de dados.
*   **Factory Method**: Define uma interface para criar um objeto, mas deixa as subclasses decidirem qual classe instanciar.
    *   *Exemplo:* `NotificationFactory` cria diferentes tipos de notificações (SMS, Email, Push) sem expor a lógica de criação ao cliente.
*   **Builder**: Separa a construção de um objeto complexo da sua representação, permitindo a criação de diferentes representações passo a passo.
    *   *Exemplo:* `ComputerBuilder` constrói um computador com diferentes configurações de hardware (HDD, RAM, Placa de Vídeo, etc.).
*   **Abstract Factory**: Permite produzir famílias de objetos relacionados sem especificar suas classes concretas.
    *   *Exemplo:* `GUIFactory` cria botões e checkboxes compatíveis para diferentes sistemas operacionais (Windows, MacOS).
    *   **Quando é recomendado:** Quando o sistema deve ser independente de como seus produtos são criados e quando produtos devem ser usados em conjunto (famílias).
    *   **Quando não é recomendado:** Quando a complexidade adicional não justifica a necessidade de criar famílias de objetos.
    *   [📖 Documentação Detalhada e Cenários de Uso](docs/ABSTRACT_FACTORY.md)
*   **Prototype**: Permite copiar objetos existentes sem fazer o código depender de suas classes.
    *   *Exemplo:* Clonagem de formas geométricas (`Circle`, `Rectangle`) mantendo suas propriedades.
    *   **Quando é recomendado:** Quando a criação direta de um objeto é custosa (tempo/recursos) ou sua configuração é complexa.
    *   **Quando não é recomendado:** Quando a clonagem de referências circulares é muito complexa ou a criação direta é trivial.
    *   [📖 Documentação Detalhada e Cenários de Uso](docs/PROTOTYPE.md)

### Estruturais (Structural)

*   **Adapter**: Permite que classes com interfaces incompatíveis trabalhem juntas. Atua como um "adaptador" entre duas interfaces.
    *   *Exemplo:* `MediaAdapter` permite que um `AudioPlayer` toque formatos de arquivo (VLC, MP4) que originalmente não suportava.

### Comportamentais (Behavioral)

*   **Observer**: Define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados e atualizados automaticamente.
    *   *Exemplo:* `NewsAgency` notifica vários `NewsChannel` quando há uma nova notícia.
*   **Strategy**: Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis. Permite que o algoritmo varie independentemente dos clientes que o utilizam.
    *   *Exemplo:* `ShoppingCart` pode processar pagamentos usando diferentes estratégias (Cartão de Crédito, Paypal).
*   **Command**: Encapsula uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações, enfileirar ou registrar solicitações e suportar operações que podem ser desfeitas.
    *   *Exemplo:* `RemoteControl` executa comandos (`LightOnCommand`, `LightOffCommand`) para controlar uma `Light`.

## Padrões Pendentes (Para Implementação Futura)

Aqui está a lista completa dos padrões GoF restantes que podem ser implementados futuramente:

### Criacionais
- [x] Abstract Factory
- [x] Prototype

### Estruturais
- [ ] Bridge
- [ ] Composite
- [ ] Decorator
- [ ] Facade
- [ ] Flyweight
- [ ] Proxy

### Comportamentais
- [ ] Chain of Responsibility
- [ ] Interpreter
- [ ] Iterator
- [ ] Mediator
- [ ] Memento
- [ ] State
- [ ] Template Method
- [ ] Visitor

## Como Executar

Para compilar e executar os exemplos, você pode usar o terminal na raiz do projeto.

1.  Compile o código (exemplo para Linux/Mac):
    ```bash
    javac -d out -sourcepath src src/com/richardikeda/javapatterns/*/*.java
    ```

2.  Execute um exemplo específico. Por exemplo, para executar o exemplo do padrão **Builder**:
    ```bash
    java -cp out com.richardikeda.javapatterns.builder.BuilderExample
    ```

Outros exemplos disponíveis para execução:
- `com.richardikeda.javapatterns.singleton.DatabaseExample`
- `com.richardikeda.javapatterns.factory.FactoryExample`
- `com.richardikeda.javapatterns.observer.ObserverExample`
- `com.richardikeda.javapatterns.strategy.StrategyExample`
- `com.richardikeda.javapatterns.adapter.AdapterExample`
- `com.richardikeda.javapatterns.command.CommandExample`
- `com.richardikeda.javapatterns.abstractfactory.AbstractFactoryExample`
- `com.richardikeda.javapatterns.prototype.PrototypeExample`

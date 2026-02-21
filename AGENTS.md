# Regras para Agentes de IA

Este arquivo contém diretrizes e regras que devem ser seguidas por qualquer agente de inteligência artificial que trabalhe neste repositório.

## 1. Planejamento Profundo (Deep Planning Mode)
Antes de iniciar qualquer tarefa de codificação ou modificação significativa, o agente deve entrar em um modo de "Planejamento Profundo".
*   O agente deve interagir com o usuário para entender completamente os requisitos.
*   Deve fazer perguntas esclarecedoras para validar suposições.
*   A aprovação do plano de execução só deve ocorrer após todas as dúvidas serem sanadas.

## 2. Idioma
*   **Português Brasileiro (PT-BR)**: Toda a documentação, comentários de código (Javadoc e comentários internos), mensagens de commit e explicações devem ser escritas exclusivamente em Português do Brasil.

## 3. Sistema de Build
*   Este projeto **não utiliza** ferramentas de build automatizadas como Maven ou Gradle.
*   A compilação e execução devem ser feitas manualmente via terminal utilizando `javac` e `java`.
    *   Compilação: `javac -d out -sourcepath src src/com/richardikeda/javapatterns/*/*.java`
    *   Execução: `java -cp out com.richardikeda.javapatterns.<pattern>.<ExampleClass>`

## 4. Padrões de Documentação
Ao implementar um novo padrão de projeto (Design Pattern):
*   **README.md**:
    *   Adicionar o padrão à lista de implementados.
    *   Incluir uma breve descrição.
    *   Incluir seções explícitas: "Quando é recomendado" e "Quando não é recomendado".
    *   Adicionar um link para um arquivo Markdown detalhado (`docs/<PATTERN>.md`).
*   **Arquivo Detalhado (`docs/<PATTERN>.md`)**:
    *   Criar um arquivo separado para cada padrão na pasta `docs/`.
    *   Este arquivo deve conter explicações aprofundadas sobre o padrão.
    *   Deve incluir cenários de uso do mundo real (ex: "Sistema de UI", "Processamento de Pagamentos").
    *   **Não deve conter código**, apenas texto explicativo e conceitual.

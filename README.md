# 🖱️ AutoClicker

<p align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Swing-Desktop-blue?style=for-the-badge" alt="Java Swing">
  <img src="https://img.shields.io/badge/AWT-Robot-orange?style=for-the-badge" alt="Java AWT Robot">
</p>

<p align="center">
  <strong>Aplicação desktop em Java para automatização de cliques do mouse.</strong>
</p>

---

## 📖 Sobre o projeto

O **AutoClicker** é uma aplicação desktop desenvolvida em Java com o objetivo de automatizar cliques do mouse.

O programa possui uma interface gráfica com botões para iniciar a automação e solicitar sua desativação. Para gerar os cliques, utiliza a classe `java.awt.Robot`, recurso da biblioteca AWT que permite controlar ações de entrada do sistema.

O projeto foi desenvolvido como exercício prático de programação Java, criação de interfaces gráficas e automação de interações com o mouse.

## ✨ Funcionalidades

* 🖱️ Execução automática de cliques do botão esquerdo do mouse.
* ▶️ Interface gráfica com botão para iniciar a automação.
* ⏱️ Intervalo de aproximadamente 50 ms entre as tentativas de clique.
* 🪟 Interface desktop construída com Java Swing.
* 🤖 Automação por meio da classe `java.awt.Robot`.

> **Limitação atual:** a implementação de ativação utiliza chamadas recursivas e não possui um mecanismo independente de interrupção. O botão de desativação encerra a aplicação. Esses pontos podem ser aprimorados em versões futuras.

## 🛠️ Tecnologias utilizadas

| Tecnologia           | Finalidade                                          |
| -------------------- | --------------------------------------------------- |
| **Java**             | Linguagem de programação                            |
| **Java Swing**       | Construção da interface gráfica                     |
| **Java AWT**         | Recursos gráficos e eventos                         |
| **`java.awt.Robot`** | Simulação de cliques do mouse                       |
| **IntelliJ IDEA**    | Ambiente de desenvolvimento identificado no projeto |

## ⚙️ Como funciona

O funcionamento é dividido em três etapas:

1. **Inicialização:** a classe principal abre a janela do AutoClicker.
2. **Ativação:** ao clicar em `Ativar`, o programa cria um objeto `Robot` e começa a executar cliques repetidos.
3. **Desativação:** ao clicar em `Desativar`, o programa exibe uma mensagem e encerra o processo.

Fluxo simplificado:

```
Main
  │
  ▼
Janela (Swing)
  │
  ├── Ativar
  │     └── Ativar.Enable()
  │             └── Robot → clique → repetição
  │
  └── Desativar
        └── Mensagem → encerramento
```

## 📁 Estrutura do projeto

```
AutoClicker/
└── src/
    ├── Main/
    │   └── Main.java
    ├── Janela/
    │   └── Janela.java
    └── Botoes/
        ├── Ativar.java
        └── Desativar.java
```

### Responsabilidade das classes

* **`Main`** — inicializa a aplicação.
* **`Janela`** — constrói a janela e configura os botões da interface.
* **`Ativar`** — executa a rotina de cliques automáticos utilizando `Robot`.
* **`Desativar`** — exibe uma mensagem e encerra a aplicação.

## ▶️ Como executar

### Pré-requisitos

* JDK instalado.
* Ambiente Java compatível com as APIs Swing e AWT.
* Ambiente gráfico com suporte à automação de entrada.

### Executando pela IDE

1. Clone o repositório.
2. Abra o projeto em uma IDE Java, como IntelliJ IDEA.
3. Localize `src/Main/Main.java`.
4. Execute o método `main`.

### Clonando o repositório

```
git clone https://github.com/RyanAlvim/AutoClicker.git
```

> O nome e o endereço do repositório devem corresponder aos configurados no GitHub.

## 🔧 Melhorias futuras

* [ ] Implementar interrupção segura da automação.
* [ ] Evitar recursão infinita e utilizar um mecanismo de execução controlada.
* [ ] Permitir configurar o intervalo entre cliques.
* [ ] Adicionar atalho global para iniciar e parar.
* [ ] Exibir o estado atual da automação na interface.
* [ ] Melhorar o tratamento de exceções e interrupções.
* [ ] Permitir encerrar a rotina sem fechar toda a aplicação.

## 🎯 Objetivos de aprendizagem

Este projeto explora conceitos importantes do desenvolvimento desktop em Java:

* Programação orientada a objetos.
* Criação de interfaces com Swing.
* Tratamento de eventos de botões.
* Uso de APIs do Java AWT.
* Automação de entrada com `Robot`.
* Organização de classes por responsabilidade.

## 📌 Estado do projeto

Projeto de automação desktop desenvolvido para fins de aprendizado e prática com Java.

A implementação atual é simples e pode evoluir com melhorias no controle da execução, na configuração dos cliques e na experiência de uso.

## 👨‍💻 Autor

**Ryan Rodrigues Alvim**

* GitHub: [@RyanAlvim](https://github.com/RyanAlvim)

---

<p align="center">
  <i>Pequenos projetos também são oportunidades para aprender, experimentar e evoluir como desenvolvedor.</i>
</p>

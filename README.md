# 🖱️ AutoClicker

<p align="center">
  <img src="https://img.shields.io/badge/Java-8%2B-orange?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Automation-AutoClicker-6C63FF?style=for-the-badge" alt="Automation">
  <img src="https://img.shields.io/badge/Language-Java-blue?style=for-the-badge" alt="Java">
</p>

<p align="center">
  <strong>AutoClicker simples desenvolvido 100% em Java.</strong>
</p>

---

## 📌 Sobre o projeto

O **AutoClicker** é uma aplicação desenvolvida inteiramente em **Java** para realizar cliques automáticos do mouse.

O projeto foi criado como uma aplicação simples de automação, permitindo executar uma sequência de cliques sem a necessidade de realizar cada interação manualmente.

Além da funcionalidade principal, o projeto também serviu como prática de conceitos relacionados à **automação de interface, manipulação de eventos e desenvolvimento de aplicações desktop em Java**.

---

## ⚙️ Como funciona

O funcionamento do projeto é baseado em um ciclo simples:

```text
┌─────────────────────┐
│ Iniciar AutoClicker │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ Definir intervalo   │
│ entre os cliques    │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ Capturar posição    │
│ do mouse             │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ Executar clique     │
└──────────┬──────────┘
           │
           ▼
┌─────────────────────┐
│ Aguardar intervalo  │
└──────────┬──────────┘
           │
           └──────────► Repetir

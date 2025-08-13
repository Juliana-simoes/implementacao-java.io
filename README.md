# Demonstração de Java I/O

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

## 📄 Sobre o Projeto

Este repositório contém uma série de exemplos práticos que demonstram as funcionalidades essenciais do pacote `java.io` em Java. O objetivo é servir como um material de consulta e estudo para entender como realizar operações de entrada (Input) e saída (Output) de dados, desde a leitura e escrita de arquivos de texto simples até a serialização de objetos.

Cada classe neste projeto foca em um conceito específico do Java I/O, mostrando sua implementação de forma clara e objetiva.

---

## ✨ Funcionalidades Demonstradas

O projeto está dividido nos seguintes exemplos:

* **Leitura de Arquivos (`TesteLeitura.java`):**
    * Demonstra como usar `FileInputStream` e `InputStreamReader` para ler um arquivo de texto linha por linha.
    * Utiliza um `BufferedReader` para otimizar a leitura.

* **Escrita de Arquivos (`TesteEscrita.java`):**
    * Mostra como usar `FileOutputStream` e `OutputStreamWriter` para escrever em um arquivo de texto.
    * Utiliza um `BufferedWriter` para uma escrita mais eficiente.

* **Cópia de Arquivos (`TesteCopiarArquivo.java`):**
    * Um exemplo prático que combina leitura e escrita para copiar o conteúdo de um arquivo para outro.

* **Serialização de Objetos (`TesteSerializacao.java`):**
    * Demonstra o processo de serialização: converter um objeto (`String`) em uma sequência de bytes para ser salvo em um arquivo (`ObjectOutputStream`).
    * Mostra também o processo de desserialização: ler os bytes de um arquivo e reconstruir o objeto original (`ObjectInputStream`).

---

## 🛠️ Tecnologias Utilizadas

* **Java SE:** O projeto foi desenvolvido usando a plataforma padrão do Java, sem a necessidade de frameworks externos.
* **Java I/O API:** Utilização das classes do pacote `java.io`, como:
    * `InputStream` e `OutputStream`
    * `Reader` e `Writer`
    * `FileInputStream` e `FileOutputStream`
    * `BufferedReader` e `BufferedWriter`
    * `ObjectInputStream` e `ObjectOutputStream`

---

Desenvolvido com o objetivo de fixar e demonstrar conceitos de I/O em Java.









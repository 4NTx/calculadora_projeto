# Calculadora com Pilha e Lista Encadeada

## Descrição

Este projeto implementa uma calculadora simples utilizando uma pilha genérica e uma lista encadeada genérica. A calculadora permite empilhar valores e operadores, realizar cálculos e imprimir o estado atual das pilhas.

## Estruturas de Dados

### Lista Encadeada Genérica (`ListaEncadeadaGenerica.java`)

- **Estrutura**: Implementa uma lista encadeada que suporta qualquer tipo de dado.
- **Métodos**:
  - `adicionar(T elemento)`: Adiciona um elemento ao final da lista.
  - `remover()`: Remove e retorna o elemento do início da lista.
  - `isEmpty()`: Retorna `true` se a lista estiver vazia.
  - `get(int index)`: Retorna o elemento na posição especificada.
  - `tamanho()`: Retorna a quantidade de elementos na lista.

### Pilha Genérica (`PilhaGenerica.java`)

- **Estrutura**: Utiliza a `ListaEncadeadaGenerica` para armazenar os elementos da pilha.
- **Métodos**:
  - `empilhar(T elemento)`: Adiciona um elemento ao topo da pilha.
  - `desempilhar()`: Remove e retorna o elemento do topo da pilha.
  - `topo()`: Retorna o elemento do topo sem removê-lo.
  - `isEmpty()`: Retorna `true` se a pilha estiver vazia.
  - `tamanho()`: Retorna a quantidade de elementos na pilha.

### Calculadora (`Calculadora.java`)

- **Estruturas de Dados**: Cria duas pilhas: uma para valores reais (`PilhaGenerica<Double>`) e outra para operadores (`PilhaGenerica<Character>`).
- **Métodos**:
  - `empilharValor()`: Solicita um valor do usuário e o empilha.
  - `empilharOperador()`: Solicita um operador e valida se é um dos permitidos (`+`, `-`, `*`, `/`).
  - `realizarCalculo()`: Desempilha dois valores e um operador para realizar o cálculo, empilhando o resultado.
  - `imprimirPilhas()`: Imprime todos os elementos das pilhas.

### Teste da Calculadora (`TestaCalculadora.java`)

- **Interação com o Usuário**: Cria um menu via terminal que permite ao usuário escolher entre as opções:
  - Empilhar valor.
  - Empilhar operador.
  - Realizar cálculo.
  - Imprimir pilhas.
  - Sair do programa.

## Como Executar

1. **Clone o repositório** ou baixe os arquivos.
2. **Abra o terminal** na pasta onde os arquivos estão localizados.
3. **Compile os arquivos Java**:
   ```bash
   javac *.java
   ```
4. **Execute o programa**:
   ```bash
   java TestaCalculadora
   ```
5. **Siga as instruções** do menu para usar a calculadora.

## Checklist do que foi pedido e implementado

| Tarefa                                                       | Status     |
|-------------------------------------------------------------|------------|
| Empilhar valor do tipo real.                                | ✔️         |
| Empilhar operador.                                          | ✔️         |
| Realizar cálculo.                                           | ✔️         |
| Imprimir pilhas.                                           | ✔️         |


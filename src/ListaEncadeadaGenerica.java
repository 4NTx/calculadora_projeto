public class ListaEncadeadaGenerica<T> {
    private class No {
        T elemento;
        No proximo;

        No(T elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    private No cabeca;
    private int tamanho;

    public ListaEncadeadaGenerica() {
        this.cabeca = null;
        this.tamanho = 0;
    }

    public void adicionar(T elemento) {
        No novoNo = new No(elemento);
        if (cabeca == null) {
            cabeca = novoNo;
        } else {
            No temp = cabeca;
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = novoNo;
        }
        tamanho++;
    }

    public T remover() {
        if (isEmpty()) {
            throw new RuntimeException("A lista está vazia.");
        }
        T elemento = cabeca.elemento;
        cabeca = cabeca.proximo;
        tamanho--;
        return elemento;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public T get(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice fora do limite.");
        }
        No temp = cabeca;
        for (int i = 0; i < index; i++) {
            temp = temp.proximo;
        }
        return temp.elemento;
    }

    public int tamanho() {
        return tamanho;
    }
}

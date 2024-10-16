public class PilhaGenerica<T> {
    private ListaEncadeadaGenerica<T> lista;

    public PilhaGenerica() {
        lista = new ListaEncadeadaGenerica<>();
    }

    public void empilhar(T elemento) {
        lista.adicionar(elemento);
    }

    public T desempilhar() {
        return lista.remover();
    }

    public T topo() {
        if (lista.isEmpty()) {
            throw new RuntimeException("A pilha está vazia.");
        }
        return lista.get(lista.tamanho() - 1);
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public int tamanho() {
        return lista.tamanho();
    }
}

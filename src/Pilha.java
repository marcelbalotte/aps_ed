public class Pilha {

    private No topo;

    public Pilha() {
        this.topo = null;
    }

    public void push(int elem) {
        No novoNo = new No(elem);
        No aux = topo;
        novoNo.proximo = aux;
        this.topo = novoNo;
    }

    public int pop() {
        if(this.isEmpty()) {
            System.out.println("Pilha Vazia");

            return -1;
        }
        No aux = topo;
        topo = topo.proximo;

        return aux.dado;
    }

    public boolean isEmpty() {

        return this.topo == null;
    }

    public int size() {
        int count = 0;
        No aux = this.topo;
        while(aux != null) {
            count++;
            aux = aux.proximo;
        }

        return count;
    }

    public int top() {

        return topo.dado;
    }

}
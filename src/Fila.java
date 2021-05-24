public class Fila {

    private Pilha pilhaPrincipal;
    private Pilha pilhaAuxiliar;

    public Fila() {
        pilhaPrincipal = new Pilha();
        pilhaAuxiliar = new Pilha();
    }

    public void queue(int elem) {
        pilhaPrincipal.push(elem);
    }

    public int dequeue() {
        if (!pilhaPrincipal.isEmpty()) {
            while (!(pilhaPrincipal.size() == 1)) {
                pilhaAuxiliar.push(pilhaPrincipal.pop());
            }

            int temp = pilhaPrincipal.pop();

            while (!(pilhaAuxiliar.isEmpty())) {
                pilhaPrincipal.push(pilhaAuxiliar.pop());
            }

            return temp;
        }

        System.out.println("Pilha Vazia");

        return -1;
    }

    public int top() {
        if (!pilhaPrincipal.isEmpty()) {
            while (!(pilhaPrincipal.size() == 1)) {
                pilhaAuxiliar.push(pilhaPrincipal.pop());
            }

            int temp = pilhaPrincipal.top();

            while (!(pilhaAuxiliar.isEmpty())) {
                pilhaPrincipal.push(pilhaAuxiliar.pop());
            }

            return temp;
        }

        System.out.println("Pilha Vazia");

        return -1;
    }

    public void print() {
        while (!pilhaPrincipal.isEmpty()) {
            pilhaAuxiliar.push(pilhaPrincipal.pop());
        }

        while (!pilhaAuxiliar.isEmpty()) {
            int temp = pilhaAuxiliar.pop();
            System.out.println(temp);
            pilhaPrincipal.push(temp);
        }

    }

    public boolean isEmpty() {

        return pilhaPrincipal.isEmpty();
    }

    public int size() {

        return pilhaPrincipal.size();
    }

}
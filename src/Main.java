public class Main {

    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.queue(73);
        fila.queue(51);
        fila.queue(17);

        System.out.println(fila.dequeue());

        fila.queue(42);

        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());
        System.out.println(fila.dequeue());

        System.out.println(fila.isEmpty());

    }

}
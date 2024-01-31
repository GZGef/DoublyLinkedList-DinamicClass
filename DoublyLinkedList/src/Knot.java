public class Knot<T> {
    T data;
    Knot prev; //ссылка на предыдущий элемент (head knot)
    Knot next; //ссылка на следующий элемент (tail knot)

    Knot(T data) {
        this.data = data;
    }

    public void infoKnot() {
        System.out.print(data + " ");
    }
}
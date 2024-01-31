public class DoubleLinkedList<T> {
    private Knot first;
    private Knot last;
    private int size;

    public boolean isEmpty() {
        return (first == null);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Knot element = first;

        while (element != null) {
            str.append(element.data)
               .append(" ");

            element = element.next;
        }

        return str.toString();
    }

//    public void printList() {
//        Knot element = first;
//
//        while (element != null) {
//            element.infoKnot();
//            element = element.next;
//        }
//
//        System.out.println();
//    }

    public void addFirst(T data) {
        Knot newKnot = new Knot(data);

        if (this.isEmpty()) {
            newKnot.next = null;
            last = newKnot;
        } else {
            first.prev = newKnot;
            newKnot.next = first;
        }
        newKnot.prev = null;
        first = newKnot;

        size++;
    }

    public void addLast(T data) {
        Knot newKnot = new Knot(data);

        if (isEmpty()) {
            newKnot.prev = null;
            first = newKnot;
        } else {
            last.next = newKnot;
            newKnot.prev = last;
        }
        newKnot.next = null;
        last = newKnot;

        size++;
    }

    public void removeFirst() {
        if (!isEmpty()) {
            if (first.next == null) {
                first = null;
                last = null;
            } else {
                first = first.next;
                first.prev = null;
            }

            size--;
        }
    }

    public void removeLast() {
        if (!isEmpty()) {
            if (first.next == null) {
                first = null;
                last = null;
            } else {
                last = last.prev;
                last.next = null;
            }

            size--;
        }
    }

    public void add(T data, int index) {
        Knot temp = new Knot(data);

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Knot element = first;

            for (int i = 0; i < index; i++) {
                element = element.next;
            }

            Knot previous = element.prev;
            previous.next = temp;
            temp.prev = previous;
            temp.next = element;
            element.prev = temp;

            size++;
        }
    }

    public void delete(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Knot element = first;

            for (int i = 0; i < index; i++) {
                element = element.next;
            }

            Knot previous = element.prev;
            Knot next = element.next;
            previous.next = element.next;
            next.prev = previous;

            size--;
        }
    }

    public void get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            System.out.println(first.data);
        } else if (index == size - 1) {
            System.out.println(last.data);
        } else {
            Knot element = first;

            for (int i = 0; i < index; i++) {
                element = element.next;
            }

            System.out.println(element.data);
        }
    }

//    public Knot getPrev() {
//        return prev;
//    }
//
//    public Knot getNext() {
//        return next;
//    }
}
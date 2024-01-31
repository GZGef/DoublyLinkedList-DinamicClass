public class LaunchProgram {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();

        list.addFirst("car 1");
        list.addFirst("car 2");
        list.addFirst(534);
        list.addFirst(121);
        list.addFirst(1);

        System.out.println(list);

        list.delete( 3);

        System.out.println(list);

        list.add( 100, 0);

        System.out.println(list);

        list.get(4);
    }
}